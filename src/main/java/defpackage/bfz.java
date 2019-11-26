package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bfz */
final class bfz extends bhc {
    private final View a;
    private final bgl b;

    bfz(View view, bgl bgl) {
        this.a = view;
        this.b = bgl;
    }

    public final void a(bgx bgx) {
        bgx.b((bhd) this);
        View view = this.a;
        if (VERSION.SDK_INT >= 28) {
            if (!bgn.e) {
                try {
                    bgn.a();
                    Method declaredMethod = bgn.a.getDeclaredMethod("removeGhost", new Class[]{View.class});
                    bgn.d = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                bgn.e = true;
            }
            if (bgn.d != null) {
                try {
                    bgn.d.invoke(null, new Object[]{view});
                } catch (IllegalAccessException unused2) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
        bgm a = bgm.a(view);
        if (a != null) {
            int i = a.d - 1;
            a.d = i;
            if (i <= 0) {
                ((bgk) a.getParent()).removeView(a);
            }
        }
        this.a.setTag(R.id.transition_transform, null);
        this.a.setTag(R.id.parent_matrix, null);
    }

    public final void b() {
        this.b.setVisibility(4);
    }

    public final void c() {
        this.b.setVisibility(0);
    }
}
