package defpackage;

import android.os.Bundle;

/* renamed from: myr */
public final class myr extends amll {
    public final void a(Bundle bundle) {
        ammj.b("Cannot set fullscreen, client disconnected.", new Object[0]);
    }

    public final void a() {
        ammj.b("Cannot dismiss fullscreen, client disconnected.", new Object[0]);
    }

    public final void a(int i, String str, long j) {
        ammj.b("Cannot send playback event, client disconnected.", new Object[0]);
    }

    public final void a(long j) {
        ammj.b("Cannot update duration, client disconnected.", new Object[0]);
    }

    public final void a(int i) {
        ammj.b("Cannot send error, client disconnected.", new Object[0]);
    }

    public final void a(boolean z) {
        ammj.b("Cannot send fullscreen event, client disconnected.", new Object[0]);
    }

    public final String a(String str) {
        ammj.b("Cannot get embed config, client disconnected.", new Object[0]);
        return amky.b.a(str);
    }
}
