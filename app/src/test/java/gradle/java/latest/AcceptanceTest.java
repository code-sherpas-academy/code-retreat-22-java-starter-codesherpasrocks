package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

public class AcceptanceTest {

  @Test
  void marsRoverExecuteForwardCommand() {
    // Initial position for the rover is 0,0,NORTH
    String expectedResponse = "0,1,NORTH";
    MarsRover marsRover = new MarsRover();
    CommandInterpreter commandInterpreter = new CommandInterpreter();
    OutputFormatter outputFormatter = new OutputFormatter();
    CommandExecutor commandExecutor = new CommandExecutor(outputFormatter, commandInterpreter, marsRover);

    String response = commandExecutor.execute("F");

    assertThat(response).isEqualTo(expectedResponse);
  }
}
