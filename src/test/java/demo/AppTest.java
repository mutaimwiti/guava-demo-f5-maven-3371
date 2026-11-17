package demo;

import static org.junit.jupiter.api.Assertions.*;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void greetsWithGuava() {
    assertEquals(1, 2);
    assertEquals(2, ImmutableList.of(1, 2).size());
  }
}
