package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;

/* renamed from: ij */
final class ij extends im {
    private final il a;

    public ij(il ilVar) {
        this.a = ilVar;
    }

    public final void a(Matrix matrix, hr hrVar, int i, Canvas canvas) {
        hr hrVar2 = hrVar;
        int i2 = i;
        Canvas canvas2 = canvas;
        il ilVar = this.a;
        float f = ilVar.e;
        float f2 = ilVar.f;
        RectF rectF = new RectF(ilVar.a, ilVar.b, ilVar.c, ilVar.d);
        Path path = hrVar2.k;
        if (f2 < 0.0f) {
            hr.i[0] = 0;
            hr.i[1] = hrVar2.f;
            hr.i[2] = hrVar2.e;
            hr.i[3] = hrVar2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            hr.i[0] = 0;
            hr.i[1] = hrVar2.d;
            hr.i[2] = hrVar2.e;
            hr.i[3] = hrVar2.f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        hr.j[1] = width;
        hr.j[2] = width + ((1.0f - width) / 2.0f);
        hrVar2.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, hr.i, hr.j, TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix);
        if (f2 >= 0.0f) {
            canvas2.clipPath(path, Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f, f2, true, hrVar2.b);
        canvas.restore();
    }
}
