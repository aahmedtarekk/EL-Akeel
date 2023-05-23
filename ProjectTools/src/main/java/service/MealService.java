package service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import database.Meal;
import database.Restaurant;
import service.RestaurantService;
import repo.RestaurantRepo;

@Path("/restaurants/{restaurantId}/meals")
public class MealService {

    @EJB
    private RestaurantService restaurantService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMeal(@PathParam("restaurantId") int restaurantId, Meal meal) {
        try {
            Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
            if (restaurant == null) {
                throw new IllegalArgumentException("Invalid restaurant ID");
            }
            
            meal.setRestaurant(restaurant);
            restaurantService.addMeal(meal);
            return Response.status(Response.Status.CREATED).entity(meal).build();
        } catch (IllegalArgumentException ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getMessage()).build();
        } catch (Exception ex) {
            return Response.serverError().entity(ex.getMessage()).build();
        }
    }
}
