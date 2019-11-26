package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;

/* renamed from: abin */
public final class abin extends aaml {
    private SetSettingEndpointOuterClass$SetSettingEndpoint a;

    public abin(aamd aamd, afpt afpt) {
        super("account/set_setting", aamd, afpt);
        g();
    }

    public final void a(SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint) {
        this.a = (SetSettingEndpointOuterClass$SetSettingEndpoint) amqw.a((Object) setSettingEndpointOuterClass$SetSettingEndpoint);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a.d);
    }

    public final /* synthetic */ anzd c() {
        athv athv = (athv) athw.e.createBuilder();
        String str = this.a.d;
        athv.copyOnWrite();
        athw athw = (athw) athv.instance;
        if (str != null) {
            athw.a |= 2;
            athw.c = str;
            athz athz = (athz) atia.e.createBuilder();
            SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = this.a;
            int i = setSettingEndpointOuterClass$SetSettingEndpoint.b;
            atia atia;
            if (i == 3) {
                boolean booleanValue = ((Boolean) setSettingEndpointOuterClass$SetSettingEndpoint.c).booleanValue();
                athz.copyOnWrite();
                atia = (atia) athz.instance;
                atia.a = 2 | atia.a;
                atia.c = booleanValue;
            } else if (i == 4) {
                long longValue = ((Long) setSettingEndpointOuterClass$SetSettingEndpoint.c).longValue();
                athz.copyOnWrite();
                atia atia2 = (atia) athz.instance;
                atia2.a |= 4;
                atia2.d = longValue;
            } else if (i == 2) {
                String str2 = (String) setSettingEndpointOuterClass$SetSettingEndpoint.c;
                athz.copyOnWrite();
                atia = (atia) athz.instance;
                if (str2 != null) {
                    atia.a |= 1;
                    atia.b = str2;
                } else {
                    throw new NullPointerException();
                }
            }
            athv.copyOnWrite();
            athw = (athw) athv.instance;
            athw.d = (atia) ((anxl) athz.build());
            athw.a |= 4;
            return athv;
        }
        throw new NullPointerException();
    }
}
