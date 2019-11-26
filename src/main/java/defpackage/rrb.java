package defpackage;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: rrb */
public final class rrb extends rrw {
    private final pue a;

    public rrb(pue pue) {
        this.a = pue;
    }

    public final void a(LocationResult locationResult) {
        this.a.a(new rra(locationResult));
    }

    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new rrd(locationAvailability));
    }

    public final synchronized void a() {
        this.a.a();
    }
}
