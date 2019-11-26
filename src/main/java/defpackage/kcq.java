package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: kcq */
public final class kcq extends ilg {
    private final akou h;
    private final akoj i;
    private final TextView j = ((TextView) this.c.findViewById(R.id.title));

    public kcq(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        super(context, akkq, akvo, (int) R.layout.grid_narrow_playlist_item, akvp);
        this.h = (akou) amqw.a((Object) flu);
        flu.a(this.c);
        this.i = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.h.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.i.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        obj = (arru) obj;
        amqw.a(obj);
        akoj akoj = this.i;
        acvx acvx = akor.a;
        apxu apxu = obj.i;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b());
        auvr auvr = null;
        akor.a.a(obj.l.d(), null);
        if ((obj.a & 4) != 0) {
            arml = obj.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((obj.a & 16) != 0) {
            arml = obj.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        if (ilg.a((List) obj.c)) {
            b(obj.c);
        } else {
            arml arml2;
            if ((obj.a & 64) != 0) {
                arml = obj.h;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            CharSequence a = ajqy.a(arml);
            if ((obj.a & 32) != 0) {
                arml2 = obj.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            a(a, ajqy.a(arml2));
        }
        if ((obj.a & 2) != 0) {
            awkv awkv = obj.b;
            if (awkv == null) {
                awkv = awkv.d;
            }
            aygk aygk;
            if ((awkv.a & 2) == 0) {
                awkv = obj.b;
                if (awkv == null) {
                    awkv = awkv.d;
                }
                if ((awkv.a & 1) != 0) {
                    awkv = obj.b;
                    if (awkv == null) {
                        awkv = awkv.d;
                    }
                    awkx awkx = awkv.b;
                    if (awkx == null) {
                        awkx = awkx.c;
                    }
                    aygk = awkx.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    a(aygk);
                }
            } else {
                awkv = obj.b;
                if (awkv == null) {
                    awkv = awkv.d;
                }
                awkt awkt = awkv.c;
                if (awkt == null) {
                    awkt = awkt.c;
                }
                aygk = awkt.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                a(aygk);
            }
        }
        View a2 = this.h.a();
        if ((obj.a & 256) != 0) {
            auvr = obj.j;
            if (auvr == null) {
                auvr = auvr.c;
            }
        }
        a(a2, auvr, obj, akor.a);
        this.h.a(akor);
        TextView textView = this.j;
        int i = obj.e;
        if (i == 0) {
            i = 1;
        }
        textView.setMaxLines(i);
    }
}
