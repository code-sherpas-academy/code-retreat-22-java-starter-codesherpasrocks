package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

public class AcceptanceTest {

  @Test
  void marsRoverExecuteCommands() {

    String expectedResponse = "3,4,NORTH";
    MarsRover marsRover = new MarsRover();
    CommandExecutor commandExecutor = new CommandExecutor(marsRover);
    String response = commandExecutor.execute("FLFL");




    assertThat(response).isEqualTo(expectedResponse);
  }
}
