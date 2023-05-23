package service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import database.User;
import repo.UserRepo;

@Path("/signup")
public class SignUpApi {

    @Inject
    private UserRepo userRepo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String signUp(User user) {
        if (user == null || user.getName() == null || user.getPassword() == null || user.getRole() == null) {
            return "Invalid user data";
        }

        userRepo.insert(user);

        return "User created successfully";
    }
}
