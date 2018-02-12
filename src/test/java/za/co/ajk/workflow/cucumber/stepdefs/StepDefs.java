package za.co.ajk.workflow.cucumber.stepdefs;

import za.co.ajk.workflow.WorkflowModuleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = WorkflowModuleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
