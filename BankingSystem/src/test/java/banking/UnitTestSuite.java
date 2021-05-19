package banking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   SampleTest.class,
   HiddenTest.class,
        UnitTest.class
})

public class UnitTestSuite {

}
