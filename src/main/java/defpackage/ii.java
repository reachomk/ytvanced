package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

/* renamed from: ii */
final class ii extends im {
    private final ik a;
    private final float b;
    private final float c;

    public ii(ik ikVar, float f, float f2) {
        this.a = ikVar;
        this.b = f;
        this.c = f2;
    }

    public final void a(Matrix matrix, hr hrVar, int i, Canvas canvas) {
        hr hrVar2 = hrVar;
        int i2 = i;
        Canvas canvas2 = canvas;
        ik ikVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (ikVar.b - this.c), (double) (ikVar.a - this.b)), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.b, this.c);
        matrix2.preRotate(a());
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        hr.g[0] = hrVar2.f;
        hr.g[1] = hrVar2.e;
        hr.g[2] = hrVar2.d;
        hrVar2.c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, hr.g, hr.h, TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, hrVar2.c);
        canvas.restore();
    }

    /* Access modifiers changed, original: final */
    public final float a() {
        ik ikVar = this.a;
        return (float) Math.toDegrees(Math.atan((double) ((ikVar.b - this.c) / (ikVar.a - this.b))));
    }
}
