package org.launchcode.techjobs.oo.test;

import org.junit.Before;
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
//    private Job emptyJob;
//    private Job emptyJob2;
//    private Job test_job1;
//    private Job testJob2;
//    private final String jobName = "Product tester";
//    private final String employerName = "ACME";
//    private final String locationName = "Desert";
//    private final String positionName = "Quality control";
//    private final String coreCompetencyName = "Persistence";
//    @Before
//    public void instantiateJobs(){
//    this.emptyJob = new Job();
//    this.emptyJob2 = new Job();
//    this.test_job1 = new Job(this.jobName,
//            new Employer(this.employerName),
//            new Location(this.locationName),
//            new PositionType(this.positionName),
//            new CoreCompetency(this.coreCompetencyName)
//    );
//    this.testJob2 = new Job(this.jobName,
//            new Employer(),
//            new Location(),
//            new PositionType(),
//            new CoreCompetency());
//
//
//    }
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
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertFalse(test_job1 == test_job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job1 = new Job("Product tester", new Employer("ACME" ), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int lastIndex = (test_job1.toString().length() -1);

        assertEquals(test_job1.toString().charAt(0), '\n');
        assertEquals(test_job1.toString().charAt(lastIndex), '\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String testString = "\n" + "ID: " + test_job1.getId() + "\n" + "Name: " +
                test_job1.getName() + "\n" + "Employer: " + test_job1.getEmployer() +
                "\n" + "Location: " + test_job1.getLocation() + "\n" + "Position Type: " +
                test_job1.getPositionType() + "\n" + "Core Competency: " +
                test_job1.getCoreCompetency() + "\n";
        assertEquals(testString, test_job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job emptyJob = new Job();
        String testStringBlank = "\n" + "ID: " + emptyJob.getId() + "\n" + "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" + "Location: Data not available"+ "\n" +
                "Position Type: Data not available" + "\n" + "Core Competency: Data not available" + "\n";
        assertEquals(testStringBlank, emptyJob.toString());
    }
}
