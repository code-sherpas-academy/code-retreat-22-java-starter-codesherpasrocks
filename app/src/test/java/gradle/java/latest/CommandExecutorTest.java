package gradle.java.latest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
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
    List<Command> listOfCommands = Arrays.asList(Command.FORWARD);
    when(commandInterpreter.execute(commands)).thenReturn(listOfCommands);
    when(marsRover.execute(listOfCommands)).thenReturn();

    String output = commandExecutor.execute(commands);

    assertThat(output).isEqualTo(expectedOutput);
  }
}
