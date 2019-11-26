package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yho */
public final class yho implements akot {
    private final Resources a;
    private final View b;
    private final akpk c = new akpk();
    private yhn d;

    public yho(Context context, akkq akkq, akpe akpe) {
        this.b = View.inflate(context, R.layout.typing_status_section, null);
        this.a = context.getResources();
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.typing_status_list);
        aknw aknw = new aknw();
        aknw.a(ycz.class, new yhl(context, akkq));
        apa a = akpe.a(aknw);
        a.a(this.c);
        recyclerView.a(new ans(0, false));
        recyclerView.a(a);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(yda yda) {
        CharSequence string;
        Map map = yda.a;
        Iterator it = this.c.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            ycz ycz = (ycz) it.next();
            ycz ycz2 = (ycz) map.get(ycz.a.b);
            if (ycz2 != null) {
                ycz.b = ycz2.b;
            } else {
                it.remove();
            }
            hashSet.add(ycz.a.b);
        }
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                this.c.add(map.get(str));
            }
        }
        View view = this.b;
        int size = this.c.size();
        if (size == 0) {
            string = this.a.getString(R.string.accessibility_typing_status_zero);
        } else if (size != 1) {
            string = this.a.getString(R.string.accessibility_typing_status_multiple);
        } else {
            string = this.a.getString(R.string.accessibility_typing_status_one);
        }
        view.setContentDescription(string);
        this.c.a();
    }

    public final void a(akpb akpb) {
        this.d.b(this);
        this.d = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        yda yda = (yda) obj;
        this.d = (yhn) akor.a("typing_status_parent");
        this.d.a(this);
        a(yda);
    }
}
