package mi.minor.minorpluscard.portal.cucumber.stepdefs;

import mi.minor.minorpluscard.portal.MinorpluscardportalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MinorpluscardportalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
