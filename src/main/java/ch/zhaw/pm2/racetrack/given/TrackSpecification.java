package ch.zhaw.pm2.racetrack.given;

import model.PositionVector;
import model.SpaceType;

/**
 * This interface specifies stuff we use to test Racetrack for grading. It shall not be altered!
 */
/**
 * Interface representing the mandatory functions of the racetrack board.<br/>
 * IMPORTANT: This interface shall not be altered!<br/>
 * It specifies elements we use to test Racetrack for grading.<br/>
 * You may change or extend the default implementation provided in
 * {@link ch.zhaw.pm2.racetrack.Track}<br/>
 * Full Javadoc can be found in the implementation file.
 */
public interface TrackSpecification {
    int MAX_CARS = 9;

    int getHeight();
    int getWidth();

    int getCarCount();

    CarSpecification getCar(int carIndex);

    SpaceType getSpaceTypeAtPosition(PositionVector position);

    char getCharRepresentationAtPosition(int row, int col);

    String toString();
}
