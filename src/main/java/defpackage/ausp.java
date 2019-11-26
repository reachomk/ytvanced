package defpackage;

/* renamed from: ausp */
public final class ausp extends anxo implements anzf {
    private ausp() {
        super(ausq.g);
    }

    public final ausp a(int i) {
        copyOnWrite();
        ausq ausq = (ausq) this.instance;
        ausq.a |= 2;
        ausq.c = i;
        return this;
    }

    public final ausp b(int i) {
        copyOnWrite();
        ausq ausq = (ausq) this.instance;
        ausq.a |= 4;
        ausq.d = i;
        return this;
    }

    public final ausp c(int i) {
        copyOnWrite();
        ausq ausq = (ausq) this.instance;
        ausq.a |= 8;
        ausq.e = i;
        return this;
    }

    public final ausp d(int i) {
        copyOnWrite();
        ausq ausq = (ausq) this.instance;
        ausq.a |= 16;
        ausq.f = i;
        return this;
    }

    /* synthetic */ ausp(byte b) {
        super(ausq.g);
    }

    public final ausp e(int i) {
        copyOnWrite();
        ausq ausq = (ausq) this.instance;
        ausq.a |= 1;
        ausq.b = i - 1;
        return this;
    }
}
