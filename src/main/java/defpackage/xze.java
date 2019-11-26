package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: xze */
public final class xze implements yaq {
    public final aaas a;
    private final Context b;
    private final SharedPreferences c;
    private final afpu d;
    private final xws e;

    public xze(Context context, SharedPreferences sharedPreferences, afpu afpu, aaas aaas, xws xws) {
        this.b = context;
        this.c = sharedPreferences;
        this.d = afpu;
        this.a = aaas;
        this.e = xws;
    }

    public final void a(avll avll) {
        String format = String.format("%s-%s", new Object[]{"NOTIFICATION_REMINDER_PROMO_SHOWN_MS", this.d.c().a()});
        if (avll.g - this.c.getLong(format, 0) >= avll.h) {
            anxp anxp = avll.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = avll.f;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d) && !((Activity) this.b).isFinishing()) {
                    arml arml;
                    arml arml2;
                    anxp = avll.e;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                    anxp.a(access$000);
                    Object b = anxp.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    aphg aphg = (aphg) b;
                    anxp anxp2 = avll.f;
                    if (anxp2 == null) {
                        anxp2 = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                    anxp2.a(access$0002);
                    Object b2 = anxp2.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    aphg aphg2 = (aphg) b2;
                    Builder builder = new Builder(this.e.a);
                    arml arml3 = null;
                    if ((1 & avll.a) != 0) {
                        arml = avll.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    Builder title = builder.setTitle(ajqy.a(arml));
                    if ((2 & avll.a) != 0) {
                        arml2 = avll.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    Builder message = title.setMessage(ajqy.a(arml2));
                    if ((aphg.a & 128) != 0) {
                        arml = aphg.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    message = message.setNegativeButton(ajqy.a(arml), new xzd(this, aphg));
                    if ((aphg2.a & 128) != 0) {
                        arml3 = aphg2.g;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    }
                    AlertDialog create = message.setPositiveButton(ajqy.a(arml3), new xzg(this, aphg2)).create();
                    create.setOnShowListener(new xzf(this, avll));
                    create.show();
                }
            }
            Editor edit = this.c.edit();
            edit.putLong(format, avll.g);
            edit.apply();
        }
    }
}
