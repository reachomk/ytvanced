package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: pyg */
abstract class pyg extends pyi {
    private final int c;
    private final Bundle d;
    private final /* synthetic */ pyd e;

    protected pyg(pyd pyd, int i, Bundle bundle) {
        this.e = pyd;
        super(pyd, Boolean.valueOf(true));
        this.c = i;
        this.d = bundle;
    }

    public abstract void a(psa psa);

    public abstract boolean a();

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void c() {
        int i = this.c;
        PendingIntent pendingIntent = null;
        if (i != 0) {
            if (i != 10) {
                this.e.a(1, null);
                Bundle bundle = this.d;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                a(new psa(this.c, pendingIntent));
                return;
            }
            this.e.a(1, null);
            throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), this.e.a(), this.e.b()}));
        } else if (!a()) {
            this.e.a(1, null);
            a(new psa(8, null));
        }
    }
}
