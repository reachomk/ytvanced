package defpackage;

import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: aldg */
public final class aldg {
    private final Map a = new IdentityHashMap();
    private final Map b = new IdentityHashMap();

    public final synchronized void a() {
        this.a.clear();
        this.b.clear();
    }

    public final synchronized void a(axgk axgk, boolean z) {
        Map map = this.a;
        axgn axgn = (axgn) ((anxo) f(axgk).toBuilder());
        axgn.copyOnWrite();
        axgk axgk2 = (axgk) axgn.instance;
        axgk2.a |= 32;
        axgk2.e = z;
        map.put(axgk, (axgk) ((anxl) axgn.build()));
    }

    public final synchronized boolean a(axgk axgk) {
        return f(axgk).e;
    }

    public final synchronized axgq b(axgk axgk) {
        Object b;
        anxp anxp = f(axgk).m;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SettingRenderer.settingDialogRenderer);
        anxp.a(access$000);
        b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (axgq) b;
    }

    public final synchronized void a(axgk axgk, axgq axgq) {
        Map map = this.a;
        axgn axgn = (axgn) ((anxo) f(axgk).toBuilder());
        anxl anxl = f(axgk).m;
        if (anxl == null) {
            anxl = axak.a;
        }
        axaj axaj = (axaj) ((anxo) anxl.toBuilder());
        axaj.a(SettingRenderer.settingDialogRenderer, axgq);
        axgn.a((axak) ((anxl) axaj.build()));
        map.put(axgk, (axgk) ((anxl) axgn.build()));
    }

    public final synchronized boolean c(axgk axgk) {
        anxp anxp;
        anxr access$000;
        anxp = f(axgk).m;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(SettingRenderer.settingDialogRenderer);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    public final synchronized boolean d(axgk axgk) {
        anxp anxp;
        anxr access$000;
        anxp = f(axgk).m;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    public final synchronized axha e(axgk axgk) {
        Object b;
        anxp anxp = f(axgk).m;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
        anxp.a(access$000);
        b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (axha) b;
    }

    public final synchronized void a(axgk axgk, axha axha) {
        Map map = this.a;
        axgn axgn = (axgn) ((anxo) f(axgk).toBuilder());
        anxl anxl = f(axgk).m;
        if (anxl == null) {
            anxl = axak.a;
        }
        axaj axaj = (axaj) ((anxo) anxl.toBuilder());
        axaj.a(SettingRenderer.settingSingleOptionMenuRenderer, axha);
        axgn.a((axak) ((anxl) axaj.build()));
        map.put(axgk, (axgk) ((anxl) axgn.build()));
    }

    public final void a(axgu axgu, boolean z) {
        Map map = this.b;
        axgx axgx = (axgx) ((anxo) b(axgu).toBuilder());
        axgx.copyOnWrite();
        axgu axgu2 = (axgu) axgx.instance;
        axgu2.a |= 8;
        axgu2.e = z;
        map.put(axgu, (axgu) ((anxl) axgx.build()));
    }

    public final boolean a(axgu axgu) {
        return b(axgu).e;
    }

    private final axgk f(axgk axgk) {
        axgk axgk2 = (axgk) this.a.get(axgk);
        return axgk2 == null ? axgk : axgk2;
    }

    private final axgu b(axgu axgu) {
        axgu axgu2 = (axgu) this.b.get(axgu);
        return axgu2 == null ? axgu : axgu2;
    }
}
