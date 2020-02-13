package org.launchcode.techjobs_oo.Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
      Job  job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
       @Test
    public void testSettingJobId(){
        assertTrue(!job1.equals(job2)&&job2.getId()-job1.getId()==1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(job1.getId(),1);
        assertEquals(job1.getName(),"Product tester");
        assertEquals(job1.getEmployer().getValue(),"ACME");
        assertEquals(job1.getLocation().getValue(),"Desert");
        assertEquals(job1.getPositionType().getValue(),"Quality control");
        assertEquals(job1.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }
    @Test
    public void testJobsToString(){
        String str = "ID: 1\n" +
               "Name: Product tester\n" +
               "Employer: ACME\n" +
               "Location: Desert\n" +
               "Position Type: Quality control\n" +
               "Core Competency: Persistence";
        assertEquals(job1.toString(),str);
    }
}
