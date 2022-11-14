package gradle.java.latest;

public class CommandInterpreter {

  public Command parse(String inputCommand) {
    if (inputCommand.equals("F")) {return Command.FORWARD;}
    throw new UnsupportedOperationException("Command not supported");
  }
}
