package defpackage;

import com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uzv */
public final class uzv implements aaov {
    private final uzu a;
    private final aaas b;
    private long c;
    private String d;
    private apxu e;
    private boolean f = false;

    public uzv(uzu uzu, aaas aaas) {
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = uzu;
    }

    public final boolean a(Long l, String str, apxu apxu) {
        if (this.f) {
            return false;
        }
        this.c = l.longValue();
        this.d = str;
        this.e = (apxu) amqw.a((Object) apxu);
        this.f = true;
        Long valueOf = Long.valueOf(this.c);
        String str2 = this.d;
        Map hashMap = new HashMap();
        hashMap.put("KEY_IDV_REQUEST_ID", valueOf);
        hashMap.put("KEY_VERIFICATION_CODE", str2);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.a(this.e, hashMap);
        return true;
    }

    public final void a(atmm atmm) {
        this.f = false;
        if (this.a != null) {
            String str = "ValidateVerificationCodeResponse contains an unexpected null value.";
            if (atmm.d.size() == 0 && (atmm.a & 2) == 0) {
                xtl.c(str);
                this.a.a();
            } else if (atmm.d.size() > 0 && (((atmi) atmm.d.get(0)).a & 1) != 0) {
                xtl.c(str);
                this.a.a();
            } else if (atmm.d.size() > 0) {
                avxw avxw = ((atmi) atmm.d.get(0)).b;
                if (avxw == null) {
                    avxw = avxw.c;
                }
                int a = avxu.a(avxw.b);
                if (a == 0) {
                    a = 1;
                }
                String valueOf = String.valueOf(Integer.toString(a - 1));
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 65);
                stringBuilder.append("ValidateVerificationCode failed with PhoneVerificationErrorType: ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
                this.a.a();
            } else {
                anxp anxp = atmm.c;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                avwu avwu = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) b).b;
                if (avwu == null) {
                    avwu = avwu.c;
                }
                if ((avwu.a & 1) != 0) {
                    anxp anxp2 = atmm.c;
                    if (anxp2 == null) {
                        anxp2 = apxu.d;
                    }
                    anxr access$0002 = anxl.checkIsLite(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint);
                    anxp2.a(access$0002);
                    Object b2 = anxp2.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    avwu avwu2 = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) b2).b;
                    if (avwu2 == null) {
                        avwu2 = avwu.c;
                    }
                    avwy avwy = avwu2.b;
                    if (avwy == null) {
                        avwy = avwy.d;
                    }
                    int i = avwy.a;
                    uzu uzu;
                    if ((i & 1) != 0) {
                        uzu = this.a;
                        avxa avxa = avwy.b;
                        if (avxa == null) {
                            avxa = avxa.c;
                        }
                        avxh avxh = avxa.b;
                        if (avxh == null) {
                            avxh = avxh.c;
                        }
                        uzu.a(avxh);
                        return;
                    } else if ((i & 2) != 0) {
                        uzu = this.a;
                        avww avww = avwy.c;
                        if (avww == null) {
                            avww = avww.c;
                        }
                        avwl avwl = avww.b;
                        if (avwl == null) {
                            avwl = avwl.g;
                        }
                        uzu.a(avwl);
                        return;
                    } else {
                        xtl.c(str);
                        this.a.a();
                        return;
                    }
                }
                xtl.c(str);
                this.a.a();
            }
        }
    }

    public final void a(bqn bqn) {
        xtl.a("Request verification code failed.", (Throwable) bqn);
        this.f = false;
        uzu uzu = this.a;
        if (uzu != null) {
            uzu.a();
        }
    }
}
