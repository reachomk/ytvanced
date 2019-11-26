package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@bamh(a = {5}, b = 64)
/* renamed from: bamb */
public final class bamb extends bama {
    private static Map h = new HashMap();
    private static Map i = new HashMap();
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    public int d;
    public int e;
    public int f;
    private byte[] g;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.b);
        byteBuffer.position(byteBuffer.position() + this.b);
        this.g = new byte[this.b];
        slice.get(this.g);
        slice.rewind();
        bamd bamd = new bamd(slice);
        this.d = bamb.a(bamd);
        int a = bamd.a(4);
        this.e = a;
        if (a == 15) {
            this.j = bamd.a(24);
        }
        this.f = bamd.a(4);
        a = this.d;
        if (a == 5 || a == 29) {
            this.k = 5;
            this.l = 1;
            if (a == 29) {
                this.m = 1;
            }
            a = bamd.a(4);
            this.n = a;
            if (a == 15) {
                this.o = bamd.a(24);
            }
            a = bamb.a(bamd);
            this.d = a;
            if (a == 22) {
                this.p = bamd.a(4);
            }
        } else {
            this.k = 0;
        }
        a = this.d;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i = this.f;
                this.v = bamd.a(1);
                int a2 = bamd.a(1);
                this.w = a2;
                if (a2 == 1) {
                    this.x = bamd.a(14);
                }
                this.y = bamd.a(1);
                if (i != 0) {
                    if (a == 6 || a == 20) {
                        this.z = bamd.a(3);
                    }
                    if (this.y == 1) {
                        if (a == 22) {
                            this.A = bamd.a(5);
                            this.B = bamd.a(11);
                        }
                        if (a == 17 || a == 19 || a == 20 || a == 23) {
                            this.C = bamd.a(1);
                            this.D = bamd.a(1);
                            this.E = bamd.a(1);
                        }
                        this.F = bamd.a(1);
                    }
                    this.G = true;
                    break;
                }
                throw new UnsupportedOperationException("can't parse program_config_element yet");
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                a = bamd.a(1);
                this.H = a;
                if (a != 1) {
                    a = bamd.a(1);
                    this.T = a;
                    if (a == 1) {
                        this.U = bamd.a(2);
                        break;
                    }
                }
                a = bamd.a(2);
                this.I = a;
                if (a != 1) {
                    this.K = bamd.a(1);
                    this.L = bamd.a(2);
                    a = bamd.a(1);
                    this.M = a;
                    if (a == 1) {
                        this.N = bamd.a(1);
                    }
                }
                if (this.I != 0) {
                    this.O = bamd.a(1);
                    this.P = bamd.a(8);
                    this.Q = bamd.a(4);
                    this.R = bamd.a(12);
                    this.S = bamd.a(2);
                }
                this.J = bamd.a(1);
                this.V = true;
                break;
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.q = bamd.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.r = bamd.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        a = this.d;
        if (!(a == 17 || a == 39)) {
            switch (a) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
        }
        a = bamd.a(2);
        this.s = a;
        if (a == 2 || a == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a == 3) {
            a = bamd.a(1);
            this.t = a;
            if (a == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.k != 5 && bamd.a() >= 16) {
            a = bamd.a(11);
            this.u = a;
            if (a == 695) {
                a = bamb.a(bamd);
                this.k = a;
                if (a == 5) {
                    a = bamd.a(1);
                    this.l = a;
                    if (a == 1) {
                        a = bamd.a(4);
                        this.n = a;
                        if (a == 15) {
                            this.o = bamd.a(24);
                        }
                        if (bamd.a() >= 12) {
                            a = bamd.a(11);
                            this.u = a;
                            if (a == 1352) {
                                this.m = bamd.a(1);
                            }
                        }
                    }
                }
                if (this.k == 22) {
                    a = bamd.a(1);
                    this.l = a;
                    if (a == 1) {
                        a = bamd.a(4);
                        this.n = a;
                        if (a == 15) {
                            this.o = bamd.a(24);
                        }
                    }
                    this.p = bamd.a(4);
                }
            }
        }
    }

    public final int b() {
        if (this.d == 2) {
            return 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    private static int a(bamd bamd) {
        int a = bamd.a(5);
        return a == 31 ? bamd.a(6) + 32 : a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioSpecificConfig{configBytes=");
        stringBuilder.append(cim.a(this.g));
        stringBuilder.append(", audioObjectType=");
        stringBuilder.append(this.d);
        String str = " (";
        stringBuilder.append(str);
        stringBuilder.append((String) i.get(Integer.valueOf(this.d)));
        stringBuilder.append("), samplingFrequencyIndex=");
        stringBuilder.append(this.e);
        stringBuilder.append(str);
        stringBuilder.append(h.get(Integer.valueOf(this.e)));
        stringBuilder.append("), samplingFrequency=");
        stringBuilder.append(this.j);
        stringBuilder.append(", channelConfiguration=");
        stringBuilder.append(this.f);
        if (this.k > 0) {
            stringBuilder.append(", extensionAudioObjectType=");
            stringBuilder.append(this.k);
            stringBuilder.append(str);
            stringBuilder.append((String) i.get(Integer.valueOf(this.k)));
            stringBuilder.append("), sbrPresentFlag=");
            stringBuilder.append(this.l);
            stringBuilder.append(", psPresentFlag=");
            stringBuilder.append(this.m);
            stringBuilder.append(", extensionSamplingFrequencyIndex=");
            stringBuilder.append(this.n);
            stringBuilder.append(str);
            stringBuilder.append(h.get(Integer.valueOf(this.n)));
            stringBuilder.append("), extensionSamplingFrequency=");
            stringBuilder.append(this.o);
            stringBuilder.append(", extensionChannelConfiguration=");
            stringBuilder.append(this.p);
        }
        stringBuilder.append(", syncExtensionType=");
        stringBuilder.append(this.u);
        if (this.G) {
            stringBuilder.append(", frameLengthFlag=");
            stringBuilder.append(this.v);
            stringBuilder.append(", dependsOnCoreCoder=");
            stringBuilder.append(this.w);
            stringBuilder.append(", coreCoderDelay=");
            stringBuilder.append(this.x);
            stringBuilder.append(", extensionFlag=");
            stringBuilder.append(this.y);
            stringBuilder.append(", layerNr=");
            stringBuilder.append(this.z);
            stringBuilder.append(", numOfSubFrame=");
            stringBuilder.append(this.A);
            stringBuilder.append(", layer_length=");
            stringBuilder.append(this.B);
            stringBuilder.append(", aacSectionDataResilienceFlag=");
            stringBuilder.append(this.C);
            stringBuilder.append(", aacScalefactorDataResilienceFlag=");
            stringBuilder.append(this.D);
            stringBuilder.append(", aacSpectralDataResilienceFlag=");
            stringBuilder.append(this.E);
            stringBuilder.append(", extensionFlag3=");
            stringBuilder.append(this.F);
        }
        if (this.V) {
            stringBuilder.append(", isBaseLayer=");
            stringBuilder.append(this.H);
            stringBuilder.append(", paraMode=");
            stringBuilder.append(this.I);
            stringBuilder.append(", paraExtensionFlag=");
            stringBuilder.append(this.J);
            stringBuilder.append(", hvxcVarMode=");
            stringBuilder.append(this.K);
            stringBuilder.append(", hvxcRateMode=");
            stringBuilder.append(this.L);
            stringBuilder.append(", erHvxcExtensionFlag=");
            stringBuilder.append(this.M);
            stringBuilder.append(", var_ScalableFlag=");
            stringBuilder.append(this.N);
            stringBuilder.append(", hilnQuantMode=");
            stringBuilder.append(this.O);
            stringBuilder.append(", hilnMaxNumLine=");
            stringBuilder.append(this.P);
            stringBuilder.append(", hilnSampleRateCode=");
            stringBuilder.append(this.Q);
            stringBuilder.append(", hilnFrameLength=");
            stringBuilder.append(this.R);
            stringBuilder.append(", hilnContMode=");
            stringBuilder.append(this.S);
            stringBuilder.append(", hilnEnhaLayer=");
            stringBuilder.append(this.T);
            stringBuilder.append(", hilnEnhaQuantMode=");
            stringBuilder.append(this.U);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamb bamb = (bamb) obj;
            return this.D == bamb.D && this.C == bamb.C && this.E == bamb.E && this.d == bamb.d && this.f == bamb.f && this.x == bamb.x && this.w == bamb.w && this.t == bamb.t && this.s == bamb.s && this.M == bamb.M && this.k == bamb.k && this.p == bamb.p && this.y == bamb.y && this.F == bamb.F && this.o == bamb.o && this.n == bamb.n && this.r == bamb.r && this.v == bamb.v && this.G == bamb.G && this.S == bamb.S && this.T == bamb.T && this.U == bamb.U && this.R == bamb.R && this.P == bamb.P && this.O == bamb.O && this.Q == bamb.Q && this.L == bamb.L && this.K == bamb.K && this.H == bamb.H && this.z == bamb.z && this.B == bamb.B && this.A == bamb.A && this.J == bamb.J && this.I == bamb.I && this.V == bamb.V && this.m == bamb.m && this.q == bamb.q && this.j == bamb.j && this.e == bamb.e && this.l == bamb.l && this.u == bamb.u && this.N == bamb.N && Arrays.equals(this.g, bamb.g);
        }
    }

    public final int hashCode() {
        byte[] bArr = this.g;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.d) * 31) + this.e) * 31) + this.j) * 31) + this.f) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V;
    }

    static {
        h.put(Integer.valueOf(0), Integer.valueOf(96000));
        Map map = h;
        Integer valueOf = Integer.valueOf(1);
        map.put(valueOf, Integer.valueOf(88200));
        map = h;
        Integer valueOf2 = Integer.valueOf(2);
        map.put(valueOf2, Integer.valueOf(64000));
        map = h;
        Integer valueOf3 = Integer.valueOf(3);
        map.put(valueOf3, Integer.valueOf(48000));
        map = h;
        Integer valueOf4 = Integer.valueOf(4);
        map.put(valueOf4, Integer.valueOf(44100));
        map = h;
        Integer valueOf5 = Integer.valueOf(5);
        map.put(valueOf5, Integer.valueOf(32000));
        map = h;
        Integer valueOf6 = Integer.valueOf(6);
        map.put(valueOf6, Integer.valueOf(24000));
        map = h;
        Integer valueOf7 = Integer.valueOf(7);
        map.put(valueOf7, Integer.valueOf(22050));
        map = h;
        Integer valueOf8 = Integer.valueOf(8);
        map.put(valueOf8, Integer.valueOf(16000));
        map = h;
        Integer valueOf9 = Integer.valueOf(9);
        map.put(valueOf9, Integer.valueOf(12000));
        map = h;
        Integer valueOf10 = Integer.valueOf(10);
        map.put(valueOf10, Integer.valueOf(11025));
        map = h;
        Integer valueOf11 = Integer.valueOf(11);
        map.put(valueOf11, Integer.valueOf(8000));
        i.put(valueOf, "AAC main");
        i.put(valueOf2, "AAC LC");
        i.put(valueOf3, "AAC SSR");
        i.put(valueOf4, "AAC LTP");
        i.put(valueOf5, "SBR");
        i.put(valueOf6, "AAC Scalable");
        i.put(valueOf7, "TwinVQ");
        i.put(valueOf8, "CELP");
        i.put(valueOf9, "HVXC");
        String str = "(reserved)";
        i.put(valueOf10, str);
        i.put(valueOf11, str);
        i.put(Integer.valueOf(12), "TTSI");
        i.put(Integer.valueOf(13), "Main synthetic");
        i.put(Integer.valueOf(14), "Wavetable synthesis");
        i.put(Integer.valueOf(15), "General MIDI");
        i.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio FX");
        i.put(Integer.valueOf(17), "ER AAC LC");
        i.put(Integer.valueOf(18), str);
        i.put(Integer.valueOf(19), "ER AAC LTP");
        i.put(Integer.valueOf(20), "ER AAC Scalable");
        i.put(Integer.valueOf(21), "ER TwinVQ");
        i.put(Integer.valueOf(22), "ER BSAC");
        i.put(Integer.valueOf(23), "ER AAC LD");
        i.put(Integer.valueOf(24), "ER CELP");
        i.put(Integer.valueOf(25), "ER HVXC");
        i.put(Integer.valueOf(26), "ER HILN");
        i.put(Integer.valueOf(27), "ER Parametric");
        i.put(Integer.valueOf(28), "SSC");
        i.put(Integer.valueOf(29), "PS");
        i.put(Integer.valueOf(30), "MPEG Surround");
        i.put(Integer.valueOf(31), "(escape)");
        i.put(Integer.valueOf(32), "Layer-1");
        i.put(Integer.valueOf(33), "Layer-2");
        i.put(Integer.valueOf(34), "Layer-3");
        i.put(Integer.valueOf(35), "DST");
        i.put(Integer.valueOf(36), "ALS");
        i.put(Integer.valueOf(37), "SLS");
        i.put(Integer.valueOf(38), "SLS non-core");
        i.put(Integer.valueOf(39), "ER AAC ELD");
        i.put(Integer.valueOf(40), "SMR Simple");
        i.put(Integer.valueOf(41), "SMR Main");
    }
}
