package ADPassignment1;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Bee extends Pane{
	
	public Bee() {
		
		//MAIN BODY
		Rectangle body = new Rectangle();
		body.setX(1000.0);
		body.setY(200.0);
		body.setWidth(130.0);
		body.setHeight(90.0);
		body.setArcHeight(35);
		body.setArcWidth(35);
		body.setFill(Color.YELLOW);
		
		//black line 1
		Rectangle line1 = new Rectangle();
		line1.setX(1080.0);
		line1.setY(200.0);
		line1.setWidth(7.0);
		line1.setHeight(90.0);
		line1.setFill(Color.BLACK);
		
		//black line 2
		Rectangle line2 = new Rectangle();
		line2.setX(1095.0);
		line2.setY(200.0);
		line2.setWidth(7.0);
		line2.setHeight(90.0);
		line2.setFill(Color.BLACK);
		
		//black line 3
		Rectangle line3= new Rectangle();
		line3.setX(1110.0);
		line3.setY(200.0);
		line3.setWidth(20.0);
		line3.setHeight(90.0);
		line3.setArcHeight(35);
		line3.setArcWidth(35);
		line3.setFill(Color.BLACK);
		
		//EYES
		Arc eye1 = new Arc();
		eye1.setCenterX(1000.0);
		eye1.setCenterY(245.0);
		eye1.setRadiusX(15.0);
		eye1.setRadiusY(24.0);
		eye1.setStartAngle(-90.0);
		eye1.setLength(360.0);
		eye1.setType(ArcType.ROUND);
		
		Arc eye2 = new Arc();
		eye2.setCenterX(1040.0);
		eye2.setCenterY(245.0);
		eye2.setRadiusX(15.0);
		eye2.setRadiusY(24.0);
		eye2.setStartAngle(-90.0);
		eye2.setLength(360.0);
		eye2.setType(ArcType.ROUND);
		
		//EYE BALL
		Rectangle ball1 = new Rectangle();
		ball1.setX(990.0);
		ball1.setY(230.0);
		ball1.setWidth(10.0);
		ball1.setHeight(13.0);
		ball1.setFill(Color.CORNFLOWERBLUE);
		
		Rectangle ball2 = new Rectangle();
		ball2.setX(1030.0);
		ball2.setY(230.0);
		ball2.setWidth(10.0);
		ball2.setHeight(13.0);
		ball2.setFill(Color.CORNFLOWERBLUE);
		
		//LEFT ANTENNA
		Rectangle antSmall1 = new Rectangle();
		antSmall1.setX(1010.0);
		antSmall1.setY(210.0);
		antSmall1.setWidth(5.0);
		antSmall1.setHeight(5.0);
		
		Rectangle antSmall2 = new Rectangle();
		antSmall2.setX(1005.0);
		antSmall2.setY(205.0);
		antSmall2.setWidth(5.0);
		antSmall2.setHeight(5.0);
		
		Rectangle antBig1 = new Rectangle();
		antBig1.setX(1000.0);
		antBig1.setY(190.0);
		antBig1.setWidth(5.0);
		antBig1.setHeight(15.0);
		
		//RIGHT ANTENNA
		Rectangle antSmall3 = new Rectangle();
		antSmall3.setX(1030.0);
		antSmall3.setY(210.0);
		antSmall3.setWidth(5.0);
		antSmall3.setHeight(5.0);
		
		Rectangle antSmall4 = new Rectangle();
		antSmall4.setX(1025.0);
		antSmall4.setY(205.0);
		antSmall4.setWidth(5.0);
		antSmall4.setHeight(5.0);
		
		Rectangle antBig2 = new Rectangle();
		antBig2.setX(1020.0);
		antBig2.setY(190.0);
		antBig2.setWidth(5.0);
		antBig2.setHeight(15.0);
		
		//LEGS
		Rectangle legSmall1 = new Rectangle();
		legSmall1.setX(1020.0);
		legSmall1.setY(290.0);
		legSmall1.setWidth(5.0);
		legSmall1.setHeight(5.0);
		
		Rectangle legBig1 = new Rectangle();
		legBig1.setX(1015.0);
		legBig1.setY(295.0);
		legBig1.setWidth(5.0);
		legBig1.setHeight(10.0);
		
		Rectangle legSmall2 = new Rectangle();
		legSmall2.setX(1040.0);
		legSmall2.setY(290.0);
		legSmall2.setWidth(5.0);
		legSmall2.setHeight(5.0);
		
		Rectangle legBig2 = new Rectangle();
		legBig2.setX(1035.0);
		legBig2.setY(295.0);
		legBig2.setWidth(5.0);
		legBig2.setHeight(10.0);
		
		Rectangle legSmall3 = new Rectangle();
		legSmall3.setX(1050.0);
		legSmall3.setY(290.0);
		legSmall3.setWidth(5.0);
		legSmall3.setHeight(5.0);
		
		Rectangle legBig3 = new Rectangle();
		legBig3.setX(1045.0);
		legBig3.setY(295.0);
		legBig3.setWidth(5.0);
		legBig3.setHeight(10.0);
		
		Rectangle legSmall4 = new Rectangle();
		legSmall4.setX(1070.0);
		legSmall4.setY(290.0);
		legSmall4.setWidth(5.0);
		legSmall4.setHeight(5.0);
		
		Rectangle legBig4 = new Rectangle();
		legBig4.setX(1075.0);
		legBig4.setY(295.0);
		legBig4.setWidth(5.0);
		legBig4.setHeight(10.0);
		
		Rectangle legSmall5 = new Rectangle();
		legSmall5.setX(1090.0);
		legSmall5.setY(290.0);
		legSmall5.setWidth(5.0);
		legSmall5.setHeight(5.0);
		
		Rectangle legBig5 = new Rectangle();
		legBig5.setX(1085.0);
		legBig5.setY(295.0);
		legBig5.setWidth(5.0);
		legBig5.setHeight(10.0);
		
		Rectangle legSmall6 = new Rectangle();
		legSmall6.setX(1110.0);
		legSmall6.setY(290.0);
		legSmall6.setWidth(5.0);
		legSmall6.setHeight(5.0);
		
		Rectangle legBig6 = new Rectangle();
		legBig6.setX(1115.0);
		legBig6.setY(295.0);
		legBig6.setWidth(5.0);
		legBig6.setHeight(10.0);
		
		//WINGS
		Arc wing1 = new Arc();
		wing1.setCenterX(1060.0);
		wing1.setCenterY(200.0);
		wing1.setRadiusX(45.0);
		wing1.setRadiusY(55.0);
		wing1.setLength(90.0);
		wing1.setStartAngle(15.0);
		wing1.setType(ArcType.ROUND);
		wing1.setFill(Color.CYAN);
		
		Arc wing2 = new Arc();
		wing2.setCenterX(1090.0);
		wing2.setCenterY(200.0);
		wing2.setRadiusX(45.0);
		wing2.setRadiusY(55.0);
		wing2.setLength(90.0);
		wing2.setStartAngle(10.0);
		wing2.setType(ArcType.ROUND);
		wing2.setFill(Color.CYAN);
		
		this.getChildren().addAll(
				body,
				line1,
				line2,
				line3,
				eye1,
				eye2,
				ball1,
				ball2,
				antSmall1,
				antSmall2,
				antBig1,
				antSmall3,
				antSmall4,
				antBig2,
				legSmall1,
				legBig1,
				legSmall2,
				legBig2,
				legSmall3,
				legBig3,
				legSmall4,
				legBig4,
				legSmall5,
				legBig5,
				legSmall6,
				legBig6,
				wing1,
				wing2
				);
		
		
	}
}
