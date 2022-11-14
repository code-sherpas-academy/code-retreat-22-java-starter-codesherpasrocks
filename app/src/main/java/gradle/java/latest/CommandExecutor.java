package gradle.java.latest;

public class CommandExecutor {

  private final CommandInterpreter commandInterpreter;
  private final MarsRover marsRover;
  private final OutputFormatter outputFormatter;

  public CommandExecutor(CommandInterpreter commandInterpreter, MarsRover marsRover, OutputFormatter outputFormatter) {
    this.commandInterpreter = commandInterpreter;
    this.marsRover = marsRover;
    this.outputFormatter = outputFormatter;
  }

  public String execute(String inputCommand) {
    Command command = commandInterpreter.parse(inputCommand);
    Position finalPosition = marsRover.execute(command);
    return outputFormatter.format(finalPosition);
  }
}
