package PresentationLayer;

import FunctionLayer.LoginSampleException;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The type Command.
 */
abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new Login());
        commands.put("register", new Register());
        commands.put("measurements", new Measurements());
        commands.put("carportRaised", new CarportRaised());
        commands.put("carportFlat", new CarportFlat());
        commands.put("carportStandard", new CarportStandard());
        commands.put("contact", new Contact());
        commands.put("loginpage", new LoginPage());
        commands.put("newUser", new NewUser());
        commands.put("createOrder", new CreateOrder());
        commands.put("CurrentOrder", new CurrentOrder());
        commands.put("PreviousOrders", new PreviousOrders());
        commands.put("logout", new Logout());
        commands.put("index", new Index());
        commands.put("customerpage", new Customerpage());
        commands.put("isLoggedOn", new IsLoggedOn());
    }

    /**
     * From command.
     *
     * @param request the request
     * @return the command
     */
    static Command from(HttpServletRequest request) {
        String targetName = request.getParameter("target");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(targetName, new UnknownCommand());   // unknowncommand er default.
    }

    /**
     * Execute string.
     *
     * @param request  the request
     * @param response the response
     * @return the string
     * @throws LoginSampleException the login sample exception
     */
    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws LoginSampleException;
}