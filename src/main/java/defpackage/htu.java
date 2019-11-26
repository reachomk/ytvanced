package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: htu */
public final class htu implements elh {
    private final nt a;
    private huk b;

    public htu(nt ntVar) {
        this.a = ntVar;
    }

    private final elf a() {
        elf elf = this.b;
        if (elf != null) {
            return elf;
        }
        String str = "PlayerFragment";
        this.b = (huk) this.a.a(str);
        if (this.b == null) {
            this.b = new huk();
            or a = this.a.a();
            a.a(R.id.player_fragment_container, this.b, str);
            a.a();
        }
        return this.b;
    }

    public final void a(Activity activity) {
        View z = a().z();
        if (z.getParent() == null) {
            ((ViewGroup) activity.findViewById(R.id.player_fragment_container)).addView(z, -1, -1);
        }
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
