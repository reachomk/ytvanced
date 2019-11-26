package defpackage;

import android.content.Intent;
import android.util.Log;

/* renamed from: anpr */
final class anpr implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ anps b;

    anpr(anps anps, Intent intent) {
        this.b = anps;
        this.a = intent;
    }

    public final void run() {
        String action = this.a.getAction();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 61);
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        this.b.a();
    }
}
