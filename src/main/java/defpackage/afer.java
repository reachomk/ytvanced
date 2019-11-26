package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: afer */
final class afer extends afes {
    public final /* synthetic */ afep a;
    private int b;

    afer(afep afep, aeuy aeuy) {
        this.a = afep;
        super(aeuy);
    }

    public final boolean handleMessage(Message message) {
        if (this.a.c) {
            int i = message.what;
            if (i == 2) {
                long o = this.a.a.o();
                long o2 = this.a.b.o();
                o -= o2;
                if (o > 50) {
                    StringBuilder stringBuilder = new StringBuilder(48);
                    stringBuilder.append("Foreground sync is ahead by ");
                    stringBuilder.append(o);
                    xtl.e(stringBuilder.toString());
                    this.b = 0;
                    this.a.a.n();
                    new Handler().postDelayed(new afeq(this), o);
                } else {
                    if (o < -50) {
                        i = this.b;
                        int i2 = i + 1;
                        this.b = i2;
                        if (i < 2) {
                            StringBuilder stringBuilder2 = new StringBuilder(56);
                            stringBuilder2.append("Foreground sync is behind. Retry seek ahead: ");
                            stringBuilder2.append(i2);
                            xtl.e(stringBuilder2.toString());
                            this.a.a.b(o2 + 4000);
                        }
                    }
                    i = this.b;
                    StringBuilder stringBuilder3 = new StringBuilder(76);
                    stringBuilder3.append("Foreground synced with time diff: ");
                    stringBuilder3.append(o);
                    stringBuilder3.append(", retries: ");
                    stringBuilder3.append(i);
                    xtl.e(stringBuilder3.toString());
                    this.b = 0;
                    this.a.z();
                }
                return true;
            } else if (i == 4) {
                this.a.z();
                return a(message);
            } else if (i == 8) {
                if (((afif) message.obj).d()) {
                    this.a.z();
                    this.a.i = null;
                }
                return a(message);
            } else if (i == 11) {
                return a(message);
            }
        }
        if (this.a.x()) {
            a(message);
        }
        return true;
    }
}
