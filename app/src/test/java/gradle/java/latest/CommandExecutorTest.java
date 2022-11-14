package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CommandExecutorTest {

  @Test
  void executeSingleCommand(){
    //ARRANGE
    String inputCommand = "F";
    Command command = Command.FORWARD;
    CommandInterpreter commandInterpreter = mock(CommandInterpreter.class);
    when(commandInterpreter.execute(inputCommand)).thenReturn(command);

    Position position = new Position();
    MarsRover marsRover = mock(MarsRover.class);
    when(marsRover.execute(command)).thenReturn(position);

    OutputFormatter outputFormatter = mock(OutputFormatter.class);

    //ACT
    CommandExecutor commandExecutor = new CommandExecutor(outputFormatter, commandInterpreter, marsRover);
    String output = commandExecutor.execute(inputCommand);

    //ASSERT
    String expectedOutput = "1,1,NORTH";
    assertThat(output).isEqualTo(expectedOutput);
  }
}
