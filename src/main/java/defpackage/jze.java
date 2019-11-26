package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;

/* renamed from: jze */
public final class jze {
    public final Context a;
    public final jvm b;
    public final akpe c;
    public final epf d;
    public final acwa e;
    public akwz f;
    public final jzj g;
    public SnappyRecyclerView h;

    public jze(Context context, akkq akkq, akpe akpe, epf epf, acwa acwa) {
        this.a = context;
        this.c = akpe;
        this.d = epf;
        this.e = acwa;
        jzg jzg = new jzg(this, this.a);
        jzg.b(0);
        this.b = jzg;
        this.g = new jzj(context, akkq);
    }
}
