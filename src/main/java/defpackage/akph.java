package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: akph */
public final class akph extends akna {
    public final apu b;
    private final akpg c;

    public akph(Map map, Map map2) {
        this(map, map2, new apu());
    }

    public akph() {
        this(amwm.a, amwm.a, new apu());
    }

    private akph(Map map, Map map2, apu apu) {
        super(map, map2);
        this.c = new akpg();
        this.b = (apu) amqw.a((Object) apu);
        if (apu instanceof akny) {
            ((akny) apu).c = (akna) amqw.a((Object) this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final akot a(int i) {
        aqj a = this.b.a(i);
        if (a != null) {
            if (a instanceof akoy) {
                return ((akoy) a).p;
            }
            Object tag = a.a.getTag(R.id.litho_presenter_tag);
            if (tag instanceof akot) {
                return (akot) tag;
            }
        }
        return null;
    }

    public final void a(View view) {
        aqj aqj;
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            afpc.a(2, afpf.crash, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    afpc.a(2, afpf.crash, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
        int b = akoz.b(view);
        akot a = akoz.a(view);
        akoz.a(a, (akpb) this);
        apu apu = this.b;
        aqj aqj2 = (akoy) a.K_().getTag(R.id.presenter_adapter_viewholder_tag);
        if (aqj2 == null) {
            akpg akpg = this.c;
            akpg.c = a;
            aqj = (akoy) akpg.b(null, b);
            akpg.c = null;
            a.K_().setTag(R.id.presenter_adapter_viewholder_tag, aqj);
        } else {
            aqj = aqj2;
        }
        apu.a(aqj);
    }
}
