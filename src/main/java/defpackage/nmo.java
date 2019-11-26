package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nmo */
public final class nmo {
    public static final nlo a = new nlo("OMX.google.raw.decoder", null);
    private static final Map b = new HashMap();

    public static synchronized List a(String str, boolean z) {
        synchronized (nmo.class) {
            nmn nmn = new nmn(str, z);
            List list = (List) b.get(nmn);
            if (list == null) {
                nmp nms;
                if (nxf.a < 21) {
                    nms = new nms();
                } else {
                    nms = new nmr(z);
                }
                list = nmo.a(nmn, nms);
                if (z && list.isEmpty() && nxf.a >= 21 && nxf.a <= 23) {
                    list = nmo.a(nmn, new nms());
                    if (!list.isEmpty()) {
                        String str2 = ((nlo) list.get(0)).a;
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 63) + String.valueOf(str2).length());
                        stringBuilder.append("MediaCodecList API didn't list secure decoder for: ");
                        stringBuilder.append(str);
                        stringBuilder.append(". Assuming: ");
                        stringBuilder.append(str2);
                        Log.w("MediaCodecUtil", stringBuilder.toString());
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(list);
                b.put(nmn, unmodifiableList);
                return unmodifiableList;
            }
            return list;
        }
    }

    private static List a(nmn nmn, nmp nmp) {
        nmn nmn2 = nmn;
        nmp nmp2 = nmp;
        ArrayList arrayList;
        String name;
        String str;
        try {
            arrayList = new ArrayList();
            String str2 = nmn2.a;
            int a = nmp.a();
            boolean b = nmp.b();
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = nmp2.a(i);
                name = a2.getName();
                if (!a2.isEncoder()) {
                    String str3 = ".secure";
                    if (!b) {
                        if (name.endsWith(str3)) {
                            continue;
                        }
                    }
                    if ((nxf.a >= 21 || !("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) && ((nxf.a >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && !((nxf.a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(name) && "a70".equals(nxf.b)) || ((nxf.a == 16 && nxf.b != null && "OMX.qcom.audio.decoder.mp3".equals(name) && ("dlxu".equals(nxf.b) || "protou".equals(nxf.b) || "ville".equals(nxf.b) || "villeplus".equals(nxf.b) || "villec2".equals(nxf.b) || nxf.b.startsWith("gee") || "C6602".equals(nxf.b) || "C6603".equals(nxf.b) || "C6606".equals(nxf.b) || "C6616".equals(nxf.b) || "L36h".equals(nxf.b) || "SO-02E".equals(nxf.b))) || (nxf.a == 16 && "OMX.qcom.audio.decoder.aac".equals(name) && ("C1504".equals(nxf.b) || "C1505".equals(nxf.b) || "C1604".equals(nxf.b) || "C1605".equals(nxf.b))))))) {
                        String str4 = "jflte";
                        if (nxf.a <= 19) {
                            if (nxf.b != null && ((nxf.b.startsWith("d2") || nxf.b.startsWith("serrano") || nxf.b.startsWith(str4) || nxf.b.startsWith("santos")) && "samsung".equals(nxf.c) && name.equals("OMX.SEC.vp8.dec"))) {
                            }
                        }
                        if (nxf.a > 19 || nxf.b == null || !nxf.b.startsWith(str4) || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                            String[] supportedTypes = a2.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i2 = 0;
                            while (i2 < length) {
                                str = supportedTypes[i2];
                                if (str.equalsIgnoreCase(str2)) {
                                    CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str);
                                    boolean a3 = nmp2.a(str2, capabilitiesForType);
                                    if (!b || nmn2.b != a3) {
                                        if (!b) {
                                            if (nmn2.b) {
                                            }
                                        }
                                        if (!b && a3) {
                                            arrayList.add(new nlo(String.valueOf(name).concat(str3), capabilitiesForType));
                                            return arrayList;
                                        }
                                    }
                                    arrayList.add(new nlo(name, capabilitiesForType));
                                }
                                i2++;
                                nmn2 = nmn;
                                nmp2 = nmp;
                            }
                            continue;
                        }
                    }
                }
                i++;
                nmn2 = nmn;
                nmp2 = nmp;
            }
            return arrayList;
        } catch (Exception e) {
            String str5 = "MediaCodecUtil";
            if (nxf.a <= 23) {
                if (!arrayList.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 46);
                    stringBuilder.append("Skipping codec ");
                    stringBuilder.append(name);
                    stringBuilder.append(" (failed to query capabilities)");
                    Log.e(str5, stringBuilder.toString());
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(name).length() + 25) + str.length());
            stringBuilder2.append("Failed to query codec ");
            stringBuilder2.append(name);
            stringBuilder2.append(" (");
            stringBuilder2.append(str);
            stringBuilder2.append(")");
            Log.e(str5, stringBuilder2.toString());
            throw e;
        } catch (Exception e2) {
            throw new nmq(e2);
        }
    }
}
