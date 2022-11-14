package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

public class AcceptanceTest {

  @Test
  void marsRoverExecuteForwardCommand() {
    // Initial position for the rover is 0,0,NORTH
    CommandInterpreter commandInterpreter = new CommandInterpreter();
    MarsRover marsRover = new MarsRover();
    OutputFormatter outputFormatter = new OutputFormatter();
    CommandExecutor commandExecutor = new CommandExecutor(commandInterpreter, marsRover, outputFormatter);

    String response = commandExecutor.execute("F");

    String expectedResponse = "0,1,NORTH";
    assertThat(response).isEqualTo(expectedResponse);
  }
}
