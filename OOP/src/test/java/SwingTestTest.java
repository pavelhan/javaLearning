import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.assertj.swing.finder.WindowFinder.findFrame;
import static org.assertj.swing.launcher.ApplicationLauncher.application;

public class SwingTestTest extends AssertJSwingJUnitTestCase {
    FrameFixture frame;

    @Override
    protected void onSetUp() {
        application(MainForm.class).start();
        frame = findFrame(new GenericTypeMatcher<Frame>(Frame.class) {
            protected boolean isMatching(Frame frame) {
                return "MainForm".equals(frame.getTitle()) && frame.isShowing();
            }
        }).using(robot());

    }


    @Test
    public void addNewDevice() {
        FrameFixture frame2;
        frame.button("Add new device").click();
        GenericTypeMatcher<JButton> textMatcher = new GenericTypeMatcher<JButton>(JButton.class) {
            @Override
            protected boolean isMatching(JButton button) {
                return "OK".equals(button.getText());
            }
        };
        frame.button(textMatcher).click();

        frame2 = findFrame(new GenericTypeMatcher<Frame>(Frame.class) {
            protected boolean isMatching(Frame frame) {
                return "AddNewDevice".equals(frame.getTitle()) && frame.isShowing();
            }
        }).using(robot());

    }
}