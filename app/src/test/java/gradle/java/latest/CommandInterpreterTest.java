package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CommandInterpreterTest {

  @Test
  void parseForwardCommand() {
    CommandInterpreter commandInterpreter = new CommandInterpreter();

    String inputCommand = "F";
    Command command = commandInterpreter.parse(inputCommand);

    Command expectedCommand = Command.FORWARD;
    assertThat(command).isEqualTo(expectedCommand);
  }
}
