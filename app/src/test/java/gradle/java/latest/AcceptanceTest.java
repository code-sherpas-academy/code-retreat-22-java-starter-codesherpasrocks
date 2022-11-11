package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

public class AcceptanceTest {

  @Test
  void marsRoverExecuteCommands() {
    String expectedResponse = "3,4,NORTH";
    MarsRover marsRover = new MarsRover();
    CommandInterpreter commandInterpreter = new CommandInterpreter();
    OutputFormatter outputFormatter = new OutputFormatter();
    CommandExecutor commandExecutor = new CommandExecutor(outputFormatter, commandInterpreter, marsRover);

    String response = commandExecutor.execute("FLFL");

    assertThat(response).isEqualTo(expectedResponse);
  }
}
