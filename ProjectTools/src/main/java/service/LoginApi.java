package service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import database.User;
import repo.UserRepo;

@Path("/login")
public class LoginApi {

    @Inject
    private UserRepo userRepo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String login(User user) {
        if (user == null || user.getName() == null || user.getPassword() == null) {
            return "Invalid user data";
        }

        User dbUser = userRepo.selectByName(user.getName());

        if (dbUser == null) {
            return "User not found";
        }

        if (!dbUser.getPassword().equals(user.getPassword())) {
            return "Incorrect password";
        }

        return "Login successful";
    }
}
