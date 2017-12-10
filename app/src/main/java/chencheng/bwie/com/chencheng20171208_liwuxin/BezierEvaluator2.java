package chencheng.bwie.com.chencheng20171208_liwuxin;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by dell on 2017/12/8.
 */

class BezierEvaluator2 implements TypeEvaluator<PointF> {
    private PointF pointF1;
    private PointF pointF2;

    public BezierEvaluator2(PointF pointF1, PointF pointF2) {
        this.pointF1 = pointF1;
        this.pointF2 = pointF2;
    }

    @Override
    public PointF evaluate(float time, PointF startValue, PointF endValue) {
        //创建一个PointF对象
        PointF point = new PointF();
        float timeLeft = 1 - time;

        point.x = timeLeft * timeLeft * timeLeft * (startValue.x)
                + 3 * timeLeft * timeLeft * time * (pointF1.x)
                + 3 * timeLeft * time * time * (pointF2.x)
                + time * time * time * (endValue.x);

        point.y = timeLeft * timeLeft * timeLeft * (startValue.y)
                + 3 * timeLeft * timeLeft * time * (pointF1.y)
                + 3 * timeLeft * time * time * (pointF2.y)
                + time * time * time * (endValue.y);
        return point;
    }
}
