package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class CommandExecutorTest {

  @Test
  void executeCommands(){
    String expectedOutput = "1,1,NORTH";
    String commands = "F";
    OutputFormatter outputFormatter = mock(OutputFormatter.class);
    CommandInterpreter commandInterpreter = mock(CommandInterpreter.class);
    MarsRover marsRover = mock(MarsRover.class);
    CommandExecutor commandExecutor = new CommandExecutor(outputFormatter, commandInterpreter, marsRover);


    String output = commandExecutor.execute(commands);

    assertThat(output).isEqualTo(expectedOutput);
  }
}
