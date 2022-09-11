package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(test_job1.getName() instanceof String);
        assertTrue(test_job1.getEmployer() instanceof Employer);
        assertTrue(test_job1.getLocation() instanceof Location);
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job1.getName(), "Product tester");
        assertEquals(test_job1.getEmployer().toString(), "ACME");
        assertEquals(test_job1.getLocation().toString(), "Desert");
        assertEquals(test_job1.getPositionType().toString(), "Quality control");
        assertEquals(test_job1.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(test_job1.equals(test_job2));
    }

}
