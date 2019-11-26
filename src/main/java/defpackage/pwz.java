package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pwz */
public final class pwz extends pvm {
    private final pts a;

    public pwz(pts pts) {
        this.a = pts;
    }

    public final void a(ptx ptx) {
        try {
            this.a.b(ptx.b);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public final void a(Status status) {
        this.a.b(status);
    }

    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 2) + String.valueOf(localizedMessage).length());
        stringBuilder.append(simpleName);
        stringBuilder.append(": ");
        stringBuilder.append(localizedMessage);
        this.a.b(new Status(10, stringBuilder.toString()));
    }

    public final void a(puq puq, boolean z) {
        pts pts = this.a;
        puq.a.put(pts, Boolean.valueOf(z));
        pts.a(new put(puq, pts));
    }
}
