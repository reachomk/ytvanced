package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yrc */
public class yrc extends apa implements yij {
    private final ywk c;
    public final List d = new ArrayList();
    private final akkq e;
    private final yim f;
    private final ymx g;
    private final Handler h;

    public yrc(ywk ywk, akkq akkq, ymx ymx, Handler handler) {
        this.c = (ywk) amqw.a((Object) ywk);
        this.e = (akkq) amqw.a((Object) akkq);
        this.f = yil.a(1);
        this.g = (ymx) amqw.a((Object) ymx);
        this.h = (Handler) amqw.a((Object) handler);
    }

    public final void bk_() {
        this.f.bk_();
    }

    public final void bl_() {
        this.f.bl_();
    }

    public aqj a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact, viewGroup, false);
        return new yrw(this.h, inflate, new yyo(this.e, inflate), this.f, this.g);
    }

    public void a(aqj aqj, int i) {
        yrw yrw = (yrw) aqj;
        ywk ywk = this.c;
        String str = ((ykv) this.d.get(i)).a;
        if (!TextUtils.equals(yrw.u, str)) {
            if (!TextUtils.isEmpty(yrw.u)) {
                yrw.s.a(yrw.u);
            }
            yrw.u = str;
            yrw.s.a(str, new yrp(yrw.p, yrw.q, ywk, str, yrw.r, yru.b, yrw.t));
        }
    }

    public int a() {
        return this.d.size();
    }
}
