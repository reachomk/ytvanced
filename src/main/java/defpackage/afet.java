package defpackage;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;

@Deprecated
/* renamed from: afet */
final class afet implements aeuy {
    private final Handler a;

    afet(Handler handler) {
        this.a = handler;
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void b() {
        this.a.sendEmptyMessage(1);
    }

    public final void a() {
        this.a.sendEmptyMessage(0);
    }

    public final void c() {
        this.a.sendEmptyMessage(2);
    }

    public final void d() {
        this.a.sendEmptyMessage(3);
    }

    public final void e() {
        this.a.sendEmptyMessage(4);
    }

    public final void f() {
        this.a.sendEmptyMessage(7);
    }

    public final void a(afif afif) {
        Message.obtain(this.a, 8, afif).sendToTarget();
    }

    public final void a(long j) {
        Message.obtain(this.a, 9, Long.valueOf(j)).sendToTarget();
    }

    public final void b(long j) {
        Message.obtain(this.a, 10, Long.valueOf(j)).sendToTarget();
    }

    public final void g() {
        this.a.sendEmptyMessage(5);
    }

    public final void h() {
        this.a.sendEmptyMessage(6);
    }

    public final void i() {
        this.a.sendEmptyMessage(21);
    }

    public final void a(aetv aetv) {
        Message.obtain(this.a, 11, aetv).sendToTarget();
    }

    public final void a(int i) {
        Message.obtain(this.a, 15, i, 0).sendToTarget();
    }

    public final void a(long j, long j2) {
        Message.obtain(this.a, 16, Pair.create(Long.valueOf(j), Long.valueOf(j2))).sendToTarget();
    }

    public final void a(float f) {
        Message.obtain(this.a, 18, Float.valueOf(f)).sendToTarget();
    }

    public final void a(String str, aevf aevf) {
        Message.obtain(this.a, 19, Pair.create(str, aevf)).sendToTarget();
    }

    public final void a(aett aett) {
        Message.obtain(this.a, 20, aett).sendToTarget();
    }

    public final void b(int i) {
        Message.obtain(this.a, 24, Integer.valueOf(i)).sendToTarget();
    }

    public final void c(int i) {
        Message.obtain(this.a, 25, Integer.valueOf(i)).sendToTarget();
    }
}
