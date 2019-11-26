package defpackage;

import java.util.Set;

/* renamed from: awu */
public class awu {
    public final awz a;
    public boolean b;
    public Set c;
    public final int d = -16711936;

    protected awu(awz awz) {
        aad.a((Object) awz, (Object) "metadataLoader cannot be null.");
        this.a = awz;
    }

    public final awu a(awx awx) {
        aad.a((Object) awx, (Object) "initCallback cannot be null");
        Set set = this.c;
        if (set != null) {
            set.remove(awx);
        }
        return this;
    }
}
