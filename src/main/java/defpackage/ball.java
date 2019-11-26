package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: ball */
public final class ball extends bakv {
    private static Map e;
    private static Map f;
    public bakq d;
    private balb g = new balb();
    private cjs h;
    private long[] i;
    private baln j;
    private int k;
    private long l;
    private long m;
    private List n;

    public final List a() {
        return null;
    }

    public final long[] b() {
        return null;
    }

    public final List c() {
        return null;
    }

    public final void close() {
        this.d.close();
    }

    public final cjx d() {
        return null;
    }

    public final String l() {
        return "soun";
    }

    public ball(bakq bakq) {
        bakq bakq2 = bakq;
        super(bakq.toString());
        this.d = bakq2;
        this.n = new ArrayList();
        baln baln = null;
        while (true) {
            baln baln2;
            baln baln3 = new baln();
            ByteBuffer allocate = ByteBuffer.allocate(7);
            while (allocate.position() < 7) {
                if (bakq2.a(allocate) == -1) {
                    baln2 = null;
                    break;
                }
            }
            bamd bamd = new bamd((ByteBuffer) allocate.rewind());
            if (bamd.a(12) == 4095) {
                bamd.a(1);
                bamd.a(2);
                baln3.b = bamd.a(1);
                bamd.a(2);
                baln3.a = bamd.a(4);
                baln3.c = ((Integer) f.get(Integer.valueOf(baln3.a))).intValue();
                bamd.a(1);
                baln3.d = bamd.a(3);
                bamd.a(1);
                bamd.a(1);
                bamd.a(1);
                bamd.a(1);
                baln3.e = bamd.a(13);
                bamd.a(11);
                if (bamd.a(2) + 1 == 1) {
                    if (baln3.b == 0) {
                        bakq2.a(ByteBuffer.allocate(2));
                    }
                    baln2 = baln3;
                    if (baln2 == null) {
                        this.j = baln;
                        double d = (double) this.j.c;
                        Double.isNaN(d);
                        d /= 1024.0d;
                        double size = (double) this.n.size();
                        Double.isNaN(size);
                        size /= d;
                        LinkedList linkedList = new LinkedList();
                        long j = 0;
                        for (bakz a : this.n) {
                            int a2 = (int) a.a();
                            j += (long) a2;
                            linkedList.add(Integer.valueOf(a2));
                            while (((double) linkedList.size()) > d) {
                                linkedList.pop();
                            }
                            if (linkedList.size() == ((int) d)) {
                                Iterator it = linkedList.iterator();
                                int i = 0;
                                while (it.hasNext()) {
                                    i += ((Integer) it.next()).intValue();
                                }
                                double d2 = (double) i;
                                Double.isNaN(d2);
                                d2 *= 8.0d;
                                double size2 = (double) linkedList.size();
                                Double.isNaN(size2);
                                d2 = (d2 / size2) * d;
                                if (d2 > ((double) this.l)) {
                                    this.l = (long) ((int) d2);
                                }
                            }
                        }
                        d = (double) (j << 3);
                        Double.isNaN(d);
                        this.m = (long) ((int) (d / size));
                        this.k = 1536;
                        this.h = new cjs();
                        cis cky = new cky("mp4a");
                        baln3 = this.j;
                        int i2 = baln3.d;
                        if (i2 == 7) {
                            cky.b = 8;
                        } else {
                            cky.b = i2;
                        }
                        cky.d = (long) baln3.c;
                        cky.a = 1;
                        cky.c = 16;
                        cis baly = new baly();
                        bamg bamg = new bamg();
                        bamg.d = 0;
                        bamm bamm = new bamm();
                        bamm.b();
                        bamg.f = bamm;
                        bamf bamf = new bamf();
                        bamf.d = 64;
                        bamf.e = 5;
                        bamf.g = this.k;
                        bamf.h = this.l;
                        bamf.i = this.m;
                        bamb bamb = new bamb();
                        bamb.d = 2;
                        baln baln4 = this.j;
                        bamb.e = baln4.a;
                        bamb.f = baln4.d;
                        bamf.j = bamb;
                        bamg.e = bamf;
                        baly.a = bamg.b();
                        cky.a(baly);
                        this.h.a(cky);
                        this.g.d = new Date();
                        this.g.c = new Date();
                        balb balb = this.g;
                        balb.a = "eng";
                        balb.h = 1.0f;
                        balb.b = (long) this.j.c;
                        this.i = new long[this.n.size()];
                        Arrays.fill(this.i, 1024);
                        return;
                    }
                    baln baln5 = baln != null ? baln : baln2;
                    this.n.add(new balk(this, bakq.b(), (long) (baln2.e - baln2.a())));
                    bakq2.a((bakq.b() + ((long) baln2.e)) - ((long) baln2.a()));
                    baln = baln5;
                } else {
                    throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
                }
            }
            throw new IOException("Expected Start Word 0xfff");
        }
    }

    public final cjs j() {
        return this.h;
    }

    public final long[] i() {
        return this.i;
    }

    public final balb k() {
        return this.g;
    }

    public final List h() {
        return this.n;
    }

    public final String toString() {
        baln baln = this.j;
        int i = baln.c;
        int i2 = baln.d;
        StringBuilder stringBuilder = new StringBuilder(63);
        stringBuilder.append("AACTrackImpl{sampleRate=");
        stringBuilder.append(i);
        stringBuilder.append(", channelconfig=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        Integer valueOf = Integer.valueOf(1);
        hashMap.put(valueOf, "AAC Main");
        Map map = e;
        Integer valueOf2 = Integer.valueOf(2);
        map.put(valueOf2, "AAC LC (Low Complexity)");
        map = e;
        Integer valueOf3 = Integer.valueOf(3);
        map.put(valueOf3, "AAC SSR (Scalable Sample Rate)");
        map = e;
        Integer valueOf4 = Integer.valueOf(4);
        map.put(valueOf4, "AAC LTP (Long Term Prediction)");
        map = e;
        Integer valueOf5 = Integer.valueOf(5);
        map.put(valueOf5, "SBR (Spectral Band Replication)");
        map = e;
        Integer valueOf6 = Integer.valueOf(6);
        map.put(valueOf6, "AAC Scalable");
        map = e;
        Integer valueOf7 = Integer.valueOf(7);
        map.put(valueOf7, "TwinVQ");
        map = e;
        Integer valueOf8 = Integer.valueOf(8);
        map.put(valueOf8, "CELP (Code Excited Linear Prediction)");
        map = e;
        Integer valueOf9 = Integer.valueOf(9);
        map.put(valueOf9, "HXVC (Harmonic Vector eXcitation Coding)");
        map = e;
        Integer valueOf10 = Integer.valueOf(10);
        String str = "Reserved";
        map.put(valueOf10, str);
        map = e;
        Integer valueOf11 = Integer.valueOf(11);
        map.put(valueOf11, str);
        e.put(Integer.valueOf(12), "TTSI (Text-To-Speech Interface)");
        e.put(Integer.valueOf(13), "Main Synthesis");
        e.put(Integer.valueOf(14), "Wavetable Synthesis");
        e.put(Integer.valueOf(15), "General MIDI");
        e.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio Effects");
        e.put(Integer.valueOf(17), "ER (Error Resilient) AAC LC");
        e.put(Integer.valueOf(18), str);
        e.put(Integer.valueOf(19), "ER AAC LTP");
        e.put(Integer.valueOf(20), "ER AAC Scalable");
        e.put(Integer.valueOf(21), "ER TwinVQ");
        e.put(Integer.valueOf(22), "ER BSAC (Bit-Sliced Arithmetic Coding)");
        e.put(Integer.valueOf(23), "ER AAC LD (Low Delay)");
        e.put(Integer.valueOf(24), "ER CELP");
        e.put(Integer.valueOf(25), "ER HVXC");
        e.put(Integer.valueOf(26), "ER HILN (Harmonic and Individual Lines plus Noise)");
        e.put(Integer.valueOf(27), "ER Parametric");
        e.put(Integer.valueOf(28), "SSC (SinuSoidal Coding)");
        e.put(Integer.valueOf(29), "PS (Parametric Stereo)");
        e.put(Integer.valueOf(30), "MPEG Surround");
        e.put(Integer.valueOf(31), "(Escape value)");
        e.put(Integer.valueOf(32), "Layer-1");
        e.put(Integer.valueOf(33), "Layer-2");
        e.put(Integer.valueOf(34), "Layer-3");
        e.put(Integer.valueOf(35), "DST (Direct Stream Transfer)");
        e.put(Integer.valueOf(36), "ALS (Audio Lossless)");
        e.put(Integer.valueOf(37), "SLS (Scalable LosslesS)");
        e.put(Integer.valueOf(38), "SLS non-core");
        e.put(Integer.valueOf(39), "ER AAC ELD (Enhanced Low Delay)");
        e.put(Integer.valueOf(40), "SMR (Symbolic Music Representation) Simple");
        e.put(Integer.valueOf(41), "SMR Main");
        e.put(Integer.valueOf(42), "USAC (Unified Speech and Audio Coding) (no SBR)");
        e.put(Integer.valueOf(43), "SAOC (Spatial Audio Object Coding)");
        e.put(Integer.valueOf(44), "LD MPEG Surround");
        e.put(Integer.valueOf(45), "USAC");
        hashMap = new HashMap();
        f = hashMap;
        Integer valueOf12 = Integer.valueOf(96000);
        Integer valueOf13 = Integer.valueOf(0);
        hashMap.put(valueOf12, valueOf13);
        map = f;
        Integer valueOf14 = Integer.valueOf(88200);
        map.put(valueOf14, valueOf);
        map = f;
        Integer valueOf15 = Integer.valueOf(64000);
        map.put(valueOf15, valueOf2);
        map = f;
        Integer num = valueOf2;
        valueOf2 = Integer.valueOf(48000);
        map.put(valueOf2, valueOf3);
        map = f;
        Integer num2 = valueOf2;
        valueOf2 = Integer.valueOf(44100);
        map.put(valueOf2, valueOf4);
        map = f;
        Integer num3 = valueOf2;
        valueOf2 = Integer.valueOf(32000);
        map.put(valueOf2, valueOf5);
        map = f;
        Integer num4 = valueOf2;
        valueOf2 = Integer.valueOf(24000);
        map.put(valueOf2, valueOf6);
        map = f;
        Integer num5 = valueOf2;
        valueOf2 = Integer.valueOf(22050);
        map.put(valueOf2, valueOf7);
        map = f;
        Integer num6 = valueOf2;
        valueOf2 = Integer.valueOf(16000);
        map.put(valueOf2, valueOf8);
        map = f;
        Integer num7 = valueOf2;
        valueOf2 = Integer.valueOf(12000);
        map.put(valueOf2, valueOf9);
        map = f;
        Integer num8 = valueOf2;
        valueOf2 = Integer.valueOf(11025);
        map.put(valueOf2, valueOf10);
        map = f;
        Integer num9 = valueOf2;
        valueOf2 = Integer.valueOf(8000);
        map.put(valueOf2, valueOf11);
        f.put(valueOf13, valueOf12);
        f.put(valueOf, valueOf14);
        f.put(num, valueOf15);
        f.put(valueOf3, num2);
        f.put(valueOf4, num3);
        f.put(valueOf5, num4);
        f.put(valueOf6, num5);
        f.put(valueOf7, num6);
        f.put(valueOf8, num7);
        f.put(valueOf9, num8);
        f.put(valueOf10, num9);
        f.put(valueOf11, valueOf2);
    }
}
