package defpackage;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: aym */
public final class aym {
    private static final HashMap[] A;
    private static final HashSet B = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap C = new HashMap();
    private static final byte[] D = "Exif\u0000\u0000".getBytes(d);
    private static final byte[] E = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(d);
    public static final String[] a = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] c = new byte[]{(byte) 65, (byte) 83, (byte) 67, (byte) 73, (byte) 73, (byte) 0, (byte) 0, (byte) 0};
    public static final Charset d = Charset.forName("US-ASCII");
    private static final int[] f = new int[]{8, 8, 8};
    private static final int[] g = new int[]{8};
    private static final byte[] h = new byte[]{(byte) -1, (byte) -40, (byte) -1};
    private static final byte[] i = new byte[]{(byte) 102, (byte) 116, (byte) 121, (byte) 112};
    private static final byte[] j = new byte[]{(byte) 109, (byte) 105, (byte) 102, (byte) 49};
    private static final byte[] k = new byte[]{(byte) 104, (byte) 101, (byte) 105, (byte) 99};
    private static final byte[] l = new byte[]{(byte) 79, (byte) 76, (byte) 89, (byte) 77, (byte) 80, (byte) 0};
    private static final byte[] m = new byte[]{(byte) 79, (byte) 76, (byte) 89, (byte) 77, (byte) 80, (byte) 85, (byte) 83, (byte) 0, (byte) 73, (byte) 73};
    private static final ayq[] n = new ayq[]{new ayq("NewSubfileType", 254, 4), new ayq("SubfileType", 255, 4), new ayq("ImageWidth", 256), new ayq("ImageLength", 257), new ayq("BitsPerSample", 258, 3), new ayq("Compression", 259, 3), new ayq("PhotometricInterpretation", 262, 3), new ayq("ImageDescription", 270, 2), new ayq("Make", 271, 2), new ayq("Model", 272, 2), new ayq("StripOffsets", 273), new ayq("Orientation", 274, 3), new ayq("SamplesPerPixel", 277, 3), new ayq("RowsPerStrip", 278), new ayq("StripByteCounts", 279), new ayq("XResolution", 282, 5), new ayq("YResolution", 283, 5), new ayq("PlanarConfiguration", 284, 3), new ayq("ResolutionUnit", 296, 3), new ayq("TransferFunction", 301, 3), new ayq("Software", 305, 2), new ayq("DateTime", 306, 2), new ayq("Artist", 315, 2), new ayq("WhitePoint", 318, 5), new ayq("PrimaryChromaticities", 319, 5), new ayq("SubIFDPointer", 330, 4), new ayq("JPEGInterchangeFormat", 513, 4), new ayq("JPEGInterchangeFormatLength", 514, 4), new ayq("YCbCrCoefficients", 529, 5), new ayq("YCbCrSubSampling", 530, 3), new ayq("YCbCrPositioning", 531, 3), new ayq("ReferenceBlackWhite", 532, 5), new ayq("Copyright", 33432, 2), new ayq("ExifIFDPointer", 34665, 4), new ayq("GPSInfoIFDPointer", 34853, 4), new ayq("SensorTopBorder", 4, 4), new ayq("SensorLeftBorder", 5, 4), new ayq("SensorBottomBorder", 6, 4), new ayq("SensorRightBorder", 7, 4), new ayq("ISO", 23, 3), new ayq("JpgFromRaw", 46, 7), new ayq("Xmp", 700, 1)};
    private static final ayq[] o = new ayq[]{new ayq("ExposureTime", 33434, 5), new ayq("FNumber", 33437, 5), new ayq("ExposureProgram", 34850, 3), new ayq("SpectralSensitivity", 34852, 2), new ayq("PhotographicSensitivity", 34855, 3), new ayq("OECF", 34856, 7), new ayq("ExifVersion", 36864, 2), new ayq("DateTimeOriginal", 36867, 2), new ayq("DateTimeDigitized", 36868, 2), new ayq("ComponentsConfiguration", 37121, 7), new ayq("CompressedBitsPerPixel", 37122, 5), new ayq("ShutterSpeedValue", 37377, 10), new ayq("ApertureValue", 37378, 5), new ayq("BrightnessValue", 37379, 10), new ayq("ExposureBiasValue", 37380, 10), new ayq("MaxApertureValue", 37381, 5), new ayq("SubjectDistance", 37382, 5), new ayq("MeteringMode", 37383, 3), new ayq("LightSource", 37384, 3), new ayq("Flash", 37385, 3), new ayq("FocalLength", 37386, 5), new ayq("SubjectArea", 37396, 3), new ayq("MakerNote", 37500, 7), new ayq("UserComment", 37510, 7), new ayq("SubSecTime", 37520, 2), new ayq("SubSecTimeOriginal", 37521, 2), new ayq("SubSecTimeDigitized", 37522, 2), new ayq("FlashpixVersion", 40960, 7), new ayq("ColorSpace", 40961, 3), new ayq("PixelXDimension", 40962), new ayq("PixelYDimension", 40963), new ayq("RelatedSoundFile", 40964, 2), new ayq("InteroperabilityIFDPointer", 40965, 4), new ayq("FlashEnergy", 41483, 5), new ayq("SpatialFrequencyResponse", 41484, 7), new ayq("FocalPlaneXResolution", 41486, 5), new ayq("FocalPlaneYResolution", 41487, 5), new ayq("FocalPlaneResolutionUnit", 41488, 3), new ayq("SubjectLocation", 41492, 3), new ayq("ExposureIndex", 41493, 5), new ayq("SensingMethod", 41495, 3), new ayq("FileSource", 41728, 7), new ayq("SceneType", 41729, 7), new ayq("CFAPattern", 41730, 7), new ayq("CustomRendered", 41985, 3), new ayq("ExposureMode", 41986, 3), new ayq("WhiteBalance", 41987, 3), new ayq("DigitalZoomRatio", 41988, 5), new ayq("FocalLengthIn35mmFilm", 41989, 3), new ayq("SceneCaptureType", 41990, 3), new ayq("GainControl", 41991, 3), new ayq("Contrast", 41992, 3), new ayq("Saturation", 41993, 3), new ayq("Sharpness", 41994, 3), new ayq("DeviceSettingDescription", 41995, 7), new ayq("SubjectDistanceRange", 41996, 3), new ayq("ImageUniqueID", 42016, 2), new ayq("DNGVersion", 50706, 1), new ayq("DefaultCropSize", 50720)};
    private static final ayq[] p = new ayq[]{new ayq("GPSVersionID", 0, 1), new ayq("GPSLatitudeRef", 1, 2), new ayq("GPSLatitude", 2, 5), new ayq("GPSLongitudeRef", 3, 2), new ayq("GPSLongitude", 4, 5), new ayq("GPSAltitudeRef", 5, 1), new ayq("GPSAltitude", 6, 5), new ayq("GPSTimeStamp", 7, 5), new ayq("GPSSatellites", 8, 2), new ayq("GPSStatus", 9, 2), new ayq("GPSMeasureMode", 10, 2), new ayq("GPSDOP", 11, 5), new ayq("GPSSpeedRef", 12, 2), new ayq("GPSSpeed", 13, 5), new ayq("GPSTrackRef", 14, 2), new ayq("GPSTrack", 15, 5), new ayq("GPSImgDirectionRef", 16, 2), new ayq("GPSImgDirection", 17, 5), new ayq("GPSMapDatum", 18, 2), new ayq("GPSDestLatitudeRef", 19, 2), new ayq("GPSDestLatitude", 20, 5), new ayq("GPSDestLongitudeRef", 21, 2), new ayq("GPSDestLongitude", 22, 5), new ayq("GPSDestBearingRef", 23, 2), new ayq("GPSDestBearing", 24, 5), new ayq("GPSDestDistanceRef", 25, 2), new ayq("GPSDestDistance", 26, 5), new ayq("GPSProcessingMethod", 27, 7), new ayq("GPSAreaInformation", 28, 7), new ayq("GPSDateStamp", 29, 2), new ayq("GPSDifferential", 30, 3)};
    private static final ayq[] q = new ayq[]{new ayq("InteroperabilityIndex", 1, 2)};
    private static final ayq[] r = new ayq[]{new ayq("NewSubfileType", 254, 4), new ayq("SubfileType", 255, 4), new ayq("ThumbnailImageWidth", 256), new ayq("ThumbnailImageLength", 257), new ayq("BitsPerSample", 258, 3), new ayq("Compression", 259, 3), new ayq("PhotometricInterpretation", 262, 3), new ayq("ImageDescription", 270, 2), new ayq("Make", 271, 2), new ayq("Model", 272, 2), new ayq("StripOffsets", 273), new ayq("Orientation", 274, 3), new ayq("SamplesPerPixel", 277, 3), new ayq("RowsPerStrip", 278), new ayq("StripByteCounts", 279), new ayq("XResolution", 282, 5), new ayq("YResolution", 283, 5), new ayq("PlanarConfiguration", 284, 3), new ayq("ResolutionUnit", 296, 3), new ayq("TransferFunction", 301, 3), new ayq("Software", 305, 2), new ayq("DateTime", 306, 2), new ayq("Artist", 315, 2), new ayq("WhitePoint", 318, 5), new ayq("PrimaryChromaticities", 319, 5), new ayq("SubIFDPointer", 330, 4), new ayq("JPEGInterchangeFormat", 513, 4), new ayq("JPEGInterchangeFormatLength", 514, 4), new ayq("YCbCrCoefficients", 529, 5), new ayq("YCbCrSubSampling", 530, 3), new ayq("YCbCrPositioning", 531, 3), new ayq("ReferenceBlackWhite", 532, 5), new ayq("Copyright", 33432, 2), new ayq("ExifIFDPointer", 34665, 4), new ayq("GPSInfoIFDPointer", 34853, 4), new ayq("DNGVersion", 50706, 1), new ayq("DefaultCropSize", 50720)};
    private static final ayq s = new ayq("StripOffsets", 273, 3);
    private static final ayq[] t = new ayq[]{new ayq("ThumbnailImage", 256, 7), new ayq("CameraSettingsIFDPointer", 8224, 4), new ayq("ImageProcessingIFDPointer", 8256, 4)};
    private static final ayq[] u = new ayq[]{new ayq("PreviewImageStart", 257, 4), new ayq("PreviewImageLength", 258, 4)};
    private static final ayq[] v = new ayq[]{new ayq("AspectFrame", 4371, 3)};
    private static final ayq[] w = new ayq[]{new ayq("ColorSpace", 55, 3)};
    private static final ayq[][] x;
    private static final ayq[] y = new ayq[]{new ayq("SubIFDPointer", 330, 4), new ayq("ExifIFDPointer", 34665, 4), new ayq("GPSInfoIFDPointer", 34853, 4), new ayq("InteroperabilityIFDPointer", 40965, 4), new ayq("CameraSettingsIFDPointer", 8224, 1), new ayq("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap[] z;
    private FileDescriptor F;
    private AssetInputStream G;
    private int H;
    private final HashMap[] I;
    private Set J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    public ByteOrder e = ByteOrder.BIG_ENDIAN;

    /* JADX WARNING: Removed duplicated region for block: B:196:0x044c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0448 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x035d A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b3 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198 A:{SYNTHETIC, Splitter:B:95:0x0198} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0520 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045e A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0448 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x035d A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b3 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198 A:{SYNTHETIC, Splitter:B:95:0x0198} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045e A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0520 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0448 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x035d A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b3 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198 A:{SYNTHETIC, Splitter:B:95:0x0198} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0520 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045e A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0448 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x035d A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b3 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198 A:{SYNTHETIC, Splitter:B:95:0x0198} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045e A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0520 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0159 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044c A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0448 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x035d A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f0 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b3 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0198 A:{SYNTHETIC, Splitter:B:95:0x0198} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0520 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045e A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135 A:{Catch:{ all -> 0x02ae, IOException -> 0x052c, all -> 0x0527 }} */
    /* JADX WARNING: Missing block: B:221:0x04b6, code skipped:
            if (java.util.Arrays.equals(r3, f) != false) goto L_0x04b8;
     */
    public aym(java.io.InputStream r26) {
        /*
        r25 = this;
        r1 = r25;
        r0 = r26;
        r25.<init>();
        r2 = x;
        r3 = r2.length;
        r3 = new java.util.HashMap[r3];
        r1.I = r3;
        r3 = new java.util.HashSet;
        r2 = r2.length;
        r3.<init>(r2);
        r1.J = r3;
        r2 = java.nio.ByteOrder.BIG_ENDIAN;
        r1.e = r2;
        if (r0 == 0) goto L_0x0530;
    L_0x001c:
        r2 = r0 instanceof android.content.res.AssetManager.AssetInputStream;
        r3 = 0;
        r5 = 0;
        r6 = 0;
        if (r2 == 0) goto L_0x002d;
    L_0x0024:
        r2 = r0;
        r2 = (android.content.res.AssetManager.AssetInputStream) r2;
        r1.G = r2;
        r1.F = r5;
    L_0x002b:
        r2 = 0;
        goto L_0x0051;
    L_0x002d:
        r2 = r0 instanceof java.io.FileInputStream;
        if (r2 == 0) goto L_0x004c;
    L_0x0031:
        r2 = r0;
        r2 = (java.io.FileInputStream) r2;
        r7 = r2.getFD();
        r8 = android.os.Build.VERSION.SDK_INT;
        r9 = 21;
        if (r8 < r9) goto L_0x004c;
    L_0x003e:
        r8 = android.system.OsConstants.SEEK_CUR;	 Catch:{ Exception -> 0x004c }
        android.system.Os.lseek(r7, r3, r8);	 Catch:{ Exception -> 0x004c }
        r1.G = r5;
        r2 = r2.getFD();
        r1.F = r2;
        goto L_0x002b;
    L_0x004c:
        r1.G = r5;
        r1.F = r5;
        goto L_0x002b;
    L_0x0051:
        r7 = x;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r7.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 >= r7) goto L_0x0062;
    L_0x0056:
        r7 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r8 = new java.util.HashMap;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r8.<init>();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7[r2] = r8;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2 + 1;
        goto L_0x0051;
    L_0x0062:
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r2.<init>(r0, r7);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.mark(r7);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = new byte[r7];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.read(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.reset();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = 0;
    L_0x0075:
        r8 = h;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r8 = r8.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r9 = 8;
        r12 = 4;
        r13 = 1;
        if (r7 >= r8) goto L_0x0181;
    L_0x007e:
        r8 = r0[r7];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r14 = h;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r14 = r14[r7];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r8 != r14) goto L_0x0089;
    L_0x0086:
        r7 = r7 + 1;
        goto L_0x0075;
    L_0x0089:
        r7 = "FUJIFILMCCD-RAW";
        r8 = java.nio.charset.Charset.defaultCharset();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r7.getBytes(r8);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r8 = 0;
    L_0x0094:
        r14 = r7.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r8 >= r14) goto L_0x017e;
    L_0x0097:
        r14 = r0[r8];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r15 = r7[r8];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r14 != r15) goto L_0x00a0;
    L_0x009d:
        r8 = r8 + 1;
        goto L_0x0094;
    L_0x00a0:
        r7 = new ayo;	 Catch:{ Exception -> 0x0139, all -> 0x0130 }
        r7.<init>(r0);	 Catch:{ Exception -> 0x0139, all -> 0x0130 }
        r8 = java.nio.ByteOrder.BIG_ENDIAN;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r7.a = r8;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r8 = r7.readInt();	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r14 = (long) r8;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r8 = new byte[r12];	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r7.read(r8);	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r5 = i;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r5 = java.util.Arrays.equals(r8, r5);	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        if (r5 == 0) goto L_0x0128;
    L_0x00bb:
        r17 = 1;
        r5 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1));
        if (r5 == 0) goto L_0x00c4;
    L_0x00c1:
        r19 = r9;
        goto L_0x00d0;
    L_0x00c4:
        r14 = r7.readLong();	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r19 = 16;
        r5 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1));
        if (r5 < 0) goto L_0x0124;
    L_0x00ce:
        r19 = 16;
    L_0x00d0:
        r21 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r5 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1));
        if (r5 <= 0) goto L_0x00d8;
    L_0x00d6:
        r14 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
    L_0x00d8:
        r14 = r14 - r19;
        r5 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1));
        if (r5 < 0) goto L_0x0120;
    L_0x00de:
        r5 = new byte[r12];	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r19 = r3;
        r8 = 0;
        r21 = 0;
    L_0x00e5:
        r22 = 4;
        r22 = r14 / r22;
        r24 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1));
        if (r24 >= 0) goto L_0x0120;
    L_0x00ed:
        r11 = r7.read(r5);	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        if (r11 != r12) goto L_0x011c;
    L_0x00f3:
        r11 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1));
        if (r11 == 0) goto L_0x0119;
    L_0x00f7:
        r11 = j;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r11 = java.util.Arrays.equals(r5, r11);	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        if (r11 == 0) goto L_0x0102;
    L_0x00ff:
        r21 = 1;
        goto L_0x010c;
    L_0x0102:
        r11 = k;	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        r11 = java.util.Arrays.equals(r5, r11);	 Catch:{ Exception -> 0x013a, all -> 0x012c }
        if (r11 != 0) goto L_0x010b;
    L_0x010a:
        goto L_0x010c;
    L_0x010b:
        r8 = 1;
    L_0x010c:
        if (r21 != 0) goto L_0x010f;
    L_0x010e:
        goto L_0x0119;
    L_0x010f:
        if (r8 != 0) goto L_0x0112;
    L_0x0111:
        goto L_0x0119;
    L_0x0112:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = 12;
        goto L_0x0182;
    L_0x0119:
        r19 = r19 + r17;
        goto L_0x00e5;
    L_0x011c:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x013f;
    L_0x0120:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x013f;
    L_0x0124:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x013f;
    L_0x0128:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x013f;
    L_0x012c:
        r0 = move-exception;
        r16 = r7;
        goto L_0x0133;
    L_0x0130:
        r0 = move-exception;
        r16 = 0;
    L_0x0133:
        if (r16 == 0) goto L_0x0138;
    L_0x0135:
        r16.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x0138:
        throw r0;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x0139:
        r7 = 0;
    L_0x013a:
        if (r7 == 0) goto L_0x013f;
    L_0x013c:
        r7.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x013f:
        r5 = new ayo;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = defpackage.aym.b(r5);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r1.e = r7;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.a = r7;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r5.readShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5 = 20306; // 0x4f52 float:2.8455E-41 double:1.00325E-319;
        if (r7 == r5) goto L_0x017c;
    L_0x0159:
        r5 = 21330; // 0x5352 float:2.989E-41 double:1.05384E-319;
        if (r7 == r5) goto L_0x017c;
    L_0x015d:
        r5 = new ayo;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = defpackage.aym.b(r5);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r1.e = r0;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.a = r0;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = r5.readShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5.close();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5 = 85;
        if (r0 != r5) goto L_0x017a;
    L_0x0177:
        r0 = 10;
        goto L_0x0182;
    L_0x017a:
        r0 = 0;
        goto L_0x0182;
    L_0x017c:
        r0 = 7;
        goto L_0x0182;
    L_0x017e:
        r0 = 9;
        goto L_0x0182;
    L_0x0181:
        r0 = 4;
    L_0x0182:
        r1.H = r0;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0 = new ayo;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.H;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5 = "ExifInterface";
        r7 = "ImageLength";
        r8 = "ImageWidth";
        r14 = 5;
        r15 = 6;
        switch(r2) {
            case 0: goto L_0x044c;
            case 1: goto L_0x044c;
            case 2: goto L_0x044c;
            case 3: goto L_0x044c;
            case 4: goto L_0x0448;
            case 5: goto L_0x044c;
            case 6: goto L_0x044c;
            case 7: goto L_0x035d;
            case 8: goto L_0x044c;
            case 9: goto L_0x02f0;
            case 10: goto L_0x02b3;
            case 11: goto L_0x044c;
            case 12: goto L_0x0198;
            default: goto L_0x0196;
        };
    L_0x0196:
        goto L_0x044f;
    L_0x0198:
        r2 = new android.media.MediaMetadataRetriever;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.<init>();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r9 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x02ae }
        r10 = 23;
        if (r9 < r10) goto L_0x01ac;
    L_0x01a3:
        r9 = new ayl;	 Catch:{ all -> 0x02ae }
        r9.<init>(r0);	 Catch:{ all -> 0x02ae }
        r2.setDataSource(r9);	 Catch:{ all -> 0x02ae }
        goto L_0x01b3;
    L_0x01ac:
        r9 = r1.F;	 Catch:{ all -> 0x02ae }
        if (r9 == 0) goto L_0x02a9;
    L_0x01b0:
        r2.setDataSource(r9);	 Catch:{ all -> 0x02ae }
    L_0x01b3:
        r9 = 33;
        r9 = r2.extractMetadata(r9);	 Catch:{ all -> 0x02ae }
        r10 = 34;
        r10 = r2.extractMetadata(r10);	 Catch:{ all -> 0x02ae }
        r14 = 26;
        r14 = r2.extractMetadata(r14);	 Catch:{ all -> 0x02ae }
        r11 = 17;
        r11 = r2.extractMetadata(r11);	 Catch:{ all -> 0x02ae }
        r3 = "yes";
        r3 = r3.equals(r14);	 Catch:{ all -> 0x02ae }
        if (r3 == 0) goto L_0x01e6;
    L_0x01d3:
        r3 = 29;
        r3 = r2.extractMetadata(r3);	 Catch:{ all -> 0x02ae }
        r4 = 30;
        r4 = r2.extractMetadata(r4);	 Catch:{ all -> 0x02ae }
        r11 = 31;
        r11 = r2.extractMetadata(r11);	 Catch:{ all -> 0x02ae }
        goto L_0x0204;
    L_0x01e6:
        r3 = "yes";
        r3 = r3.equals(r11);	 Catch:{ all -> 0x02ae }
        if (r3 == 0) goto L_0x0201;
    L_0x01ee:
        r3 = 18;
        r3 = r2.extractMetadata(r3);	 Catch:{ all -> 0x02ae }
        r4 = 19;
        r4 = r2.extractMetadata(r4);	 Catch:{ all -> 0x02ae }
        r11 = 24;
        r11 = r2.extractMetadata(r11);	 Catch:{ all -> 0x02ae }
        goto L_0x0204;
    L_0x0201:
        r3 = 0;
        r4 = 0;
        r11 = 0;
    L_0x0204:
        if (r3 == 0) goto L_0x0217;
    L_0x0206:
        r14 = r1.I;	 Catch:{ all -> 0x02ae }
        r14 = r14[r6];	 Catch:{ all -> 0x02ae }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ all -> 0x02ae }
        r12 = r1.e;	 Catch:{ all -> 0x02ae }
        r3 = defpackage.ayn.a(r3, r12);	 Catch:{ all -> 0x02ae }
        r14.put(r8, r3);	 Catch:{ all -> 0x02ae }
    L_0x0217:
        if (r4 == 0) goto L_0x022a;
    L_0x0219:
        r3 = r1.I;	 Catch:{ all -> 0x02ae }
        r3 = r3[r6];	 Catch:{ all -> 0x02ae }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ all -> 0x02ae }
        r8 = r1.e;	 Catch:{ all -> 0x02ae }
        r4 = defpackage.ayn.a(r4, r8);	 Catch:{ all -> 0x02ae }
        r3.put(r7, r4);	 Catch:{ all -> 0x02ae }
    L_0x022a:
        if (r11 == 0) goto L_0x0253;
    L_0x022c:
        r3 = java.lang.Integer.parseInt(r11);	 Catch:{ all -> 0x02ae }
        r4 = 90;
        if (r3 == r4) goto L_0x0243;
    L_0x0234:
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r3 == r4) goto L_0x0241;
    L_0x0238:
        r4 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r3 == r4) goto L_0x023e;
    L_0x023c:
        r3 = 1;
        goto L_0x0244;
    L_0x023e:
        r3 = 8;
        goto L_0x0244;
    L_0x0241:
        r3 = 3;
        goto L_0x0244;
    L_0x0243:
        r3 = 6;
    L_0x0244:
        r4 = r1.I;	 Catch:{ all -> 0x02ae }
        r4 = r4[r6];	 Catch:{ all -> 0x02ae }
        r7 = "Orientation";
        r8 = r1.e;	 Catch:{ all -> 0x02ae }
        r3 = defpackage.ayn.a(r3, r8);	 Catch:{ all -> 0x02ae }
        r4.put(r7, r3);	 Catch:{ all -> 0x02ae }
    L_0x0253:
        if (r9 != 0) goto L_0x0256;
    L_0x0255:
        goto L_0x02a4;
    L_0x0256:
        if (r10 == 0) goto L_0x02a4;
    L_0x0258:
        r3 = java.lang.Integer.parseInt(r9);	 Catch:{ all -> 0x02ae }
        r4 = java.lang.Integer.parseInt(r10);	 Catch:{ all -> 0x02ae }
        if (r4 <= r15) goto L_0x029c;
    L_0x0262:
        r7 = (long) r3;	 Catch:{ all -> 0x02ae }
        r0.a(r7);	 Catch:{ all -> 0x02ae }
        r3 = new byte[r15];	 Catch:{ all -> 0x02ae }
        r7 = r0.read(r3);	 Catch:{ all -> 0x02ae }
        if (r7 != r15) goto L_0x0294;
    L_0x026e:
        r4 = r4 + -6;
        r7 = D;	 Catch:{ all -> 0x02ae }
        r3 = java.util.Arrays.equals(r3, r7);	 Catch:{ all -> 0x02ae }
        if (r3 == 0) goto L_0x028c;
    L_0x0278:
        r3 = new byte[r4];	 Catch:{ all -> 0x02ae }
        r7 = r0.read(r3);	 Catch:{ all -> 0x02ae }
        if (r7 != r4) goto L_0x0284;
    L_0x0280:
        r1.a(r3, r6);	 Catch:{ all -> 0x02ae }
        goto L_0x02a4;
    L_0x0284:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x02ae }
        r3 = "Can't read exif";
        r0.<init>(r3);	 Catch:{ all -> 0x02ae }
        throw r0;	 Catch:{ all -> 0x02ae }
    L_0x028c:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x02ae }
        r3 = "Invalid identifier";
        r0.<init>(r3);	 Catch:{ all -> 0x02ae }
        throw r0;	 Catch:{ all -> 0x02ae }
    L_0x0294:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x02ae }
        r3 = "Can't read identifier";
        r0.<init>(r3);	 Catch:{ all -> 0x02ae }
        throw r0;	 Catch:{ all -> 0x02ae }
    L_0x029c:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x02ae }
        r3 = "Invalid exif length";
        r0.<init>(r3);	 Catch:{ all -> 0x02ae }
        throw r0;	 Catch:{ all -> 0x02ae }
    L_0x02a4:
        r2.release();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x02a9:
        r2.release();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x02ae:
        r0 = move-exception;
        r2.release();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        throw r0;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x02b3:
        r1.a(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "JpgFromRaw";
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x02c9;
    L_0x02c4:
        r2 = r1.O;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r1.a(r0, r2, r14);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x02c9:
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "ISO";
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3[r13];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "PhotographicSensitivity";
        r3 = r3.get(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (defpackage.ayn) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x044f;
    L_0x02e3:
        if (r3 != 0) goto L_0x044f;
    L_0x02e5:
        r3 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3[r13];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "PhotographicSensitivity";
        r3.put(r4, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x02f0:
        r2 = 84;
        r0.skipBytes(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = 4;
        r3 = new byte[r2];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = new byte[r2];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.read(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.skipBytes(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.read(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = java.nio.ByteBuffer.wrap(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2.getInt();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = java.nio.ByteBuffer.wrap(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3.getInt();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r1.a(r0, r2, r14);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (long) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.a(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = java.nio.ByteOrder.BIG_ENDIAN;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.a = r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r0.readInt();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = 0;
    L_0x0323:
        if (r3 >= r2) goto L_0x044f;
    L_0x0325:
        r4 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r9 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r10 = s;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r10 = r10.a;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r4 != r10) goto L_0x0357;
    L_0x0333:
        r2 = r0.readShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r0.readShort();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = defpackage.ayn.a(r2, r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = defpackage.ayn.a(r3, r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r4[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4.put(r7, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.put(r8, r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x0357:
        r0.skipBytes(r9);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3 + 1;
        goto L_0x0323;
    L_0x035d:
        r1.a(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r13];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "MakerNote";
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x044f;
    L_0x036e:
        r3 = new ayo;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2.b;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.a = r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = l;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.readFully(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r11 = 0;
        r3.a(r11);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = m;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r4.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = new byte[r4];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.readFully(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r11 = l;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = java.util.Arrays.equals(r2, r11);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x039a;
    L_0x0396:
        r3.a(r9);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x03a7;
    L_0x039a:
        r2 = m;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = java.util.Arrays.equals(r4, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x03a7;
    L_0x03a2:
        r9 = 12;
        r3.a(r9);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x03a7:
        r1.b(r3, r15);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "PreviewImageStart";
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "PreviewImageLength";
        r3 = r3.get(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (defpackage.ayn) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 != 0) goto L_0x03c7;
    L_0x03c6:
        goto L_0x03db;
    L_0x03c7:
        if (r3 == 0) goto L_0x03db;
    L_0x03c9:
        r4 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r4[r14];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r9 = "JPEGInterchangeFormat";
        r4.put(r9, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r14];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "JPEGInterchangeFormatLength";
        r2.put(r4, r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x03db:
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "AspectFrame";
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x044f;
    L_0x03eb:
        r3 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2.a(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (int[]) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (int[]) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r2 == 0) goto L_0x042f;
    L_0x03f7:
        r3 = r2.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = 4;
        if (r3 == r4) goto L_0x03fc;
    L_0x03fb:
        goto L_0x042f;
    L_0x03fc:
        r3 = 2;
        r3 = r2[r3];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r2[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 <= r4) goto L_0x044f;
    L_0x0403:
        r9 = 3;
        r10 = r2[r9];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r13];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r10 <= r2) goto L_0x044f;
    L_0x040a:
        r3 = r3 - r4;
        r3 = r3 + r13;
        r10 = r10 - r2;
        r10 = r10 + r13;
        if (r3 >= r10) goto L_0x0414;
    L_0x0410:
        r3 = r3 + r10;
        r10 = r3 - r10;
        r3 = r3 - r10;
    L_0x0414:
        r2 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = defpackage.ayn.a(r3, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = defpackage.ayn.a(r10, r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r4[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4.put(r8, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2[r6];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2.put(r7, r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x042f:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.<init>();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "Invalid aspect frame values. frame=";
        r3.append(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = java.util.Arrays.toString(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3.append(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r3.toString();	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        android.util.Log.w(r5, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x0448:
        r1.a(r0, r6, r6);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x044f;
    L_0x044c:
        r1.a(r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x044f:
        r2 = r1.I;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = "Compression";
        r3 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (defpackage.ayn) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 == 0) goto L_0x0520;
    L_0x045e:
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3.b(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 == r13) goto L_0x0472;
    L_0x0466:
        if (r3 == r15) goto L_0x046d;
    L_0x0468:
        r4 = 7;
        if (r3 == r4) goto L_0x0472;
    L_0x046b:
        goto L_0x0523;
    L_0x046d:
        r1.a(r0, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x0523;
    L_0x0472:
        r3 = "BitsPerSample";
        r3 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (defpackage.ayn) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 == 0) goto L_0x0523;
    L_0x047c:
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3.a(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (int[]) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (int[]) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = f;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = java.util.Arrays.equals(r4, r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r4 != 0) goto L_0x04b8;
    L_0x048e:
        r4 = r1.H;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = 3;
        if (r4 != r7) goto L_0x0523;
    L_0x0493:
        r4 = "PhotometricInterpretation";
        r4 = r2.get(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = (defpackage.ayn) r4;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r4 == 0) goto L_0x0523;
    L_0x049d:
        r7 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r4.b(r7);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r4 != r13) goto L_0x04ae;
    L_0x04a5:
        r4 = g;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = java.util.Arrays.equals(r3, r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 == 0) goto L_0x0523;
    L_0x04ad:
        goto L_0x04b8;
    L_0x04ae:
        if (r4 != r15) goto L_0x0523;
    L_0x04b0:
        r4 = f;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = java.util.Arrays.equals(r3, r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 == 0) goto L_0x0523;
    L_0x04b8:
        r3 = "StripOffsets";
        r3 = r2.get(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = (defpackage.ayn) r3;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = "StripByteCounts";
        r2 = r2.get(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = (defpackage.ayn) r2;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 != 0) goto L_0x04cb;
    L_0x04ca:
        goto L_0x0523;
    L_0x04cb:
        if (r2 == 0) goto L_0x0523;
    L_0x04cd:
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = r3.a(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r3 = defpackage.aym.a(r3);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = r1.e;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = r2.a(r4);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r2 = defpackage.aym.a(r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r3 != 0) goto L_0x04e9;
    L_0x04e3:
        r0 = "stripOffsets should not be null.";
        android.util.Log.w(r5, r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x0523;
    L_0x04e9:
        if (r2 != 0) goto L_0x04f1;
    L_0x04eb:
        r0 = "stripByteCounts should not be null.";
        android.util.Log.w(r5, r0);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        goto L_0x0523;
    L_0x04f1:
        r4 = r2.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5 = 0;
        r7 = 0;
    L_0x04f5:
        if (r5 < r4) goto L_0x051a;
    L_0x04f7:
        r4 = (int) r7;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r4 = new byte[r4];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r5 = 0;
        r7 = 0;
        r8 = 0;
    L_0x04fd:
        r9 = r3.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        if (r5 >= r9) goto L_0x0523;
    L_0x0500:
        r9 = r3[r5];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r10 = (int) r9;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r11 = r2[r5];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r9 = (int) r11;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r10 = r10 - r7;
        r11 = (long) r10;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.a(r11);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r7 + r10;
        r10 = new byte[r9];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r0.read(r10);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r7 + r9;
        r9 = r10.length;	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        java.lang.System.arraycopy(r10, r6, r4, r8, r9);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r8 = r8 + r9;
        r5 = r5 + 1;
        goto L_0x04fd;
    L_0x051a:
        r9 = r2[r5];	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
        r7 = r7 + r9;
        r5 = r5 + 1;
        goto L_0x04f5;
    L_0x0520:
        r1.a(r0, r2);	 Catch:{ IOException -> 0x052c, all -> 0x0527 }
    L_0x0523:
        r25.a();
        return;
    L_0x0527:
        r0 = move-exception;
        r25.a();
        throw r0;
    L_0x052c:
        r25.a();
        return;
    L_0x0530:
        r0 = new java.lang.NullPointerException;
        r2 = "inputStream cannot be null";
        r0.<init>(r2);
        goto L_0x0539;
    L_0x0538:
        throw r0;
    L_0x0539:
        goto L_0x0538;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.<init>(java.io.InputStream):void");
    }

    public final ayn a(String str) {
        Object str2;
        if ("ISOSpeedRatings".equals(str2)) {
            str2 = "PhotographicSensitivity";
        }
        for (int i = 0; i < x.length; i++) {
            ayn ayn = (ayn) this.I[i].get(str2);
            if (ayn != null) {
                return ayn;
            }
        }
        return null;
    }

    private final String b(String str) {
        ayn a = a(str);
        if (a == null) {
            return null;
        }
        if (!B.contains(str)) {
            return a.c(this.e);
        }
        ayp[] aypArr;
        ayp ayp;
        if (str.equals("GPSTimeStamp")) {
            int i = a.a;
            String str2 = "ExifInterface";
            if (i == 5 || i == 10) {
                aypArr = (ayp[]) a.a(this.e);
                if (aypArr == null || aypArr.length != 3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid GPS Timestamp array. array=");
                    stringBuilder.append(Arrays.toString(aypArr));
                    Log.w(str2, stringBuilder.toString());
                    return null;
                }
                Object[] objArr = new Object[3];
                ayp ayp2 = aypArr[0];
                objArr[0] = Integer.valueOf((int) (((float) ayp2.a) / ((float) ayp2.b)));
                ayp2 = aypArr[1];
                objArr[1] = Integer.valueOf((int) (((float) ayp2.a) / ((float) ayp2.b)));
                ayp = aypArr[2];
                objArr[2] = Integer.valueOf((int) (((float) ayp.a) / ((float) ayp.b)));
                return String.format("%02d:%02d:%02d", objArr);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("GPS Timestamp format is not rational. format=");
            stringBuilder2.append(a.a);
            Log.w(str2, stringBuilder2.toString());
            return null;
        }
        try {
            Object a2 = a.a(this.e);
            if (a2 != null) {
                double parseDouble;
                if (a2 instanceof String) {
                    parseDouble = Double.parseDouble((String) a2);
                } else {
                    String str3 = "There are more than one component";
                    if (a2 instanceof long[]) {
                        long[] jArr = (long[]) a2;
                        if (jArr.length == 1) {
                            parseDouble = (double) jArr[0];
                        } else {
                            throw new NumberFormatException(str3);
                        }
                    } else if (a2 instanceof int[]) {
                        int[] iArr = (int[]) a2;
                        if (iArr.length == 1) {
                            parseDouble = (double) iArr[0];
                        } else {
                            throw new NumberFormatException(str3);
                        }
                    } else if (a2 instanceof double[]) {
                        double[] dArr = (double[]) a2;
                        if (dArr.length == 1) {
                            parseDouble = dArr[0];
                        } else {
                            throw new NumberFormatException(str3);
                        }
                    } else if (a2 instanceof ayp[]) {
                        aypArr = (ayp[]) a2;
                        if (aypArr.length == 1) {
                            ayp = aypArr[0];
                            parseDouble = (double) ayp.a;
                            double d = (double) ayp.b;
                            Double.isNaN(parseDouble);
                            Double.isNaN(d);
                            parseDouble /= d;
                        } else {
                            throw new NumberFormatException(str3);
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                }
                return Double.toString(parseDouble);
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0084 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0108 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7  */
    private final void a(defpackage.ayo r11, int r12, int r13) {
        /*
        r10 = this;
        r0 = java.nio.ByteOrder.BIG_ENDIAN;
        r11.a = r0;
        r0 = (long) r12;
        r11.a(r0);
        r0 = r11.readByte();
        r1 = "Invalid marker: ";
        r2 = -1;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 != r2) goto L_0x0157;
    L_0x0013:
        r0 = r11.readByte();
        r4 = -40;
        if (r0 != r4) goto L_0x013e;
    L_0x001b:
        r12 = r12 + 2;
    L_0x001d:
        r0 = r11.readByte();
        if (r0 != r2) goto L_0x0121;
    L_0x0023:
        r0 = r11.readByte();
        r1 = -39;
        if (r0 != r1) goto L_0x002d;
    L_0x002b:
        goto L_0x011c;
    L_0x002d:
        r1 = -38;
        if (r0 == r1) goto L_0x011c;
    L_0x0031:
        r1 = r11.readUnsignedShort();
        r4 = -2;
        r1 = r1 + r4;
        r12 = r12 + 4;
        r5 = "Invalid length";
        if (r1 < 0) goto L_0x0116;
    L_0x003d:
        r6 = -31;
        r7 = 1;
        r8 = 0;
        if (r0 == r6) goto L_0x008c;
    L_0x0043:
        if (r0 == r4) goto L_0x00d2;
    L_0x0045:
        switch(r0) {
            case -64: goto L_0x0053;
            case -63: goto L_0x0053;
            case -62: goto L_0x0053;
            case -61: goto L_0x0053;
            default: goto L_0x0048;
        };
    L_0x0048:
        switch(r0) {
            case -59: goto L_0x0053;
            case -58: goto L_0x0053;
            case -57: goto L_0x0053;
            default: goto L_0x004b;
        };
    L_0x004b:
        switch(r0) {
            case -55: goto L_0x0053;
            case -54: goto L_0x0053;
            case -53: goto L_0x0053;
            default: goto L_0x004e;
        };
    L_0x004e:
        switch(r0) {
            case -51: goto L_0x0053;
            case -50: goto L_0x0053;
            case -49: goto L_0x0053;
            default: goto L_0x0051;
        };
    L_0x0051:
        goto L_0x00f5;
    L_0x0053:
        r0 = r11.skipBytes(r7);
        if (r0 != r7) goto L_0x0084;
    L_0x0059:
        r0 = r10.I;
        r0 = r0[r13];
        r4 = r11.readUnsignedShort();
        r6 = (long) r4;
        r4 = r10.e;
        r4 = defpackage.ayn.a(r6, r4);
        r6 = "ImageLength";
        r0.put(r6, r4);
        r0 = r10.I;
        r0 = r0[r13];
        r4 = r11.readUnsignedShort();
        r6 = (long) r4;
        r4 = r10.e;
        r4 = defpackage.ayn.a(r6, r4);
        r6 = "ImageWidth";
        r0.put(r6, r4);
        r1 = r1 + -5;
        goto L_0x00f5;
    L_0x0084:
        r11 = new java.io.IOException;
        r12 = "Invalid SOFx";
        r11.<init>(r12);
        throw r11;
    L_0x008c:
        r0 = new byte[r1];
        r11.readFully(r0);
        r1 = r1 + r12;
        r4 = D;
        r4 = defpackage.aym.a(r0, r4);
        if (r4 == 0) goto L_0x00ac;
    L_0x009a:
        r4 = D;
        r6 = r4.length;
        r4 = r4.length;
        r9 = r0.length;
        r0 = java.util.Arrays.copyOfRange(r0, r4, r9);
        r10.a(r0, r13);
        r12 = r12 + r6;
        r10.K = r12;
    L_0x00a9:
        r12 = r1;
        r1 = 0;
        goto L_0x00d2;
    L_0x00ac:
        r12 = E;
        r12 = defpackage.aym.a(r0, r12);
        if (r12 == 0) goto L_0x00a9;
    L_0x00b4:
        r12 = E;
        r12 = r12.length;
        r4 = r0.length;
        r12 = java.util.Arrays.copyOfRange(r0, r12, r4);
        r0 = "Xmp";
        r4 = r10.b(r0);
        if (r4 != 0) goto L_0x00a9;
    L_0x00c4:
        r4 = r10.I;
        r4 = r4[r8];
        r6 = new ayn;
        r9 = r12.length;
        r6.<init>(r7, r9, r12, r8);
        r4.put(r0, r6);
        goto L_0x00a9;
    L_0x00d2:
        r0 = new byte[r1];
        r4 = r11.read(r0);
        if (r4 != r1) goto L_0x010e;
    L_0x00da:
        r1 = "UserComment";
        r4 = r10.b(r1);
        if (r4 != 0) goto L_0x00f4;
    L_0x00e2:
        r4 = r10.I;
        r4 = r4[r7];
        r6 = new java.lang.String;
        r7 = d;
        r6.<init>(r0, r7);
        r0 = defpackage.ayn.a(r6);
        r4.put(r1, r0);
    L_0x00f4:
        r1 = 0;
    L_0x00f5:
        if (r1 < 0) goto L_0x0108;
    L_0x00f7:
        r0 = r11.skipBytes(r1);
        if (r0 != r1) goto L_0x0100;
    L_0x00fd:
        r12 = r12 + r1;
        goto L_0x001d;
    L_0x0100:
        r11 = new java.io.IOException;
        r12 = "Invalid JPEG segment";
        r11.<init>(r12);
        throw r11;
    L_0x0108:
        r11 = new java.io.IOException;
        r11.<init>(r5);
        throw r11;
    L_0x010e:
        r11 = new java.io.IOException;
        r12 = "Invalid exif";
        r11.<init>(r12);
        throw r11;
    L_0x0116:
        r11 = new java.io.IOException;
        r11.<init>(r5);
        throw r11;
    L_0x011c:
        r12 = r10.e;
        r11.a = r12;
        return;
    L_0x0121:
        r11 = new java.io.IOException;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "Invalid marker:";
        r12.append(r13);
        r13 = r0 & 255;
        r13 = java.lang.Integer.toHexString(r13);
        r12.append(r13);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
    L_0x013e:
        r11 = new java.io.IOException;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12.append(r1);
        r13 = java.lang.Integer.toHexString(r3);
        r12.append(r13);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
    L_0x0157:
        r11 = new java.io.IOException;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12.append(r1);
        r13 = r0 & 255;
        r13 = java.lang.Integer.toHexString(r13);
        r12.append(r13);
        r12 = r12.toString();
        r11.<init>(r12);
        goto L_0x0173;
    L_0x0172:
        throw r11;
    L_0x0173:
        goto L_0x0172;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.a(ayo, int, int):void");
    }

    private final void a(ayo ayo) {
        a(ayo, ayo.available());
        b(ayo, 0);
        c(ayo, 0);
        c(ayo, 5);
        c(ayo, 4);
        a(0, 5);
        a(0, 4);
        a(5, 4);
        ayn ayn = (ayn) this.I[1].get("PixelXDimension");
        ayn ayn2 = (ayn) this.I[1].get("PixelYDimension");
        if (!(ayn == null || ayn2 == null)) {
            this.I[0].put("ImageWidth", ayn);
            this.I[0].put("ImageLength", ayn2);
        }
        if (this.I[4].isEmpty() && a(this.I[5])) {
            HashMap[] hashMapArr = this.I;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        a(this.I[4]);
        if (this.H == 8) {
            ayn = (ayn) this.I[1].get("MakerNote");
            if (ayn != null) {
                ayo ayo2 = new ayo(ayn.b);
                ayo2.a = this.e;
                ayo2.a(6);
                b(ayo2, 9);
                String str = "ColorSpace";
                ayn = (ayn) this.I[9].get(str);
                if (ayn != null) {
                    this.I[1].put(str, ayn);
                }
            }
        }
    }

    private final void a(byte[] bArr, int i) {
        ayo ayo = new ayo(bArr);
        a(ayo, bArr.length);
        b(ayo, i);
    }

    private final void a() {
        String b = b("DateTimeOriginal");
        if (b != null) {
            String str = "DateTime";
            if (b(str) == null) {
                this.I[0].put(str, ayn.a(b));
            }
        }
        b = "ImageWidth";
        if (b(b) == null) {
            this.I[0].put(b, ayn.a(0, this.e));
        }
        b = "ImageLength";
        if (b(b) == null) {
            this.I[0].put(b, ayn.a(0, this.e));
        }
        b = "Orientation";
        if (b(b) == null) {
            this.I[0].put(b, ayn.a(0, this.e));
        }
        b = "LightSource";
        if (b(b) == null) {
            this.I[1].put(b, ayn.a(0, this.e));
        }
    }

    private static ByteOrder b(ayo ayo) {
        short readShort = ayo.readShort();
        if (readShort == (short) 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == (short) 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid byte order: ");
        stringBuilder.append(Integer.toHexString(readShort));
        throw new IOException(stringBuilder.toString());
    }

    private final void a(ayo ayo, int i) {
        this.e = aym.b(ayo);
        ayo.a = this.e;
        int readUnsignedShort = ayo.readUnsignedShort();
        int i2 = this.H;
        StringBuilder stringBuilder;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            readUnsignedShort = ayo.readInt();
            if (readUnsignedShort < 8 || readUnsignedShort >= i) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid first Ifd offset: ");
                stringBuilder.append(readUnsignedShort);
                throw new IOException(stringBuilder.toString());
            }
            readUnsignedShort -= 8;
            if (readUnsignedShort > 0 && ayo.skipBytes(readUnsignedShort) != readUnsignedShort) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't jump to first Ifd: ");
                stringBuilder.append(readUnsignedShort);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid start code: ");
        stringBuilder.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0224  */
    /* JADX WARNING: Missing block: B:99:0x01ef, code skipped:
            if ("Model".equals(r4.b) != false) goto L_0x01f1;
     */
    /* JADX WARNING: Missing block: B:101:0x01fd, code skipped:
            if (r6.c(r0.e).contains("PENTAX") == false) goto L_0x0203;
     */
    /* JADX WARNING: Missing block: B:104:0x0209, code skipped:
            if (r5.equals(r4.b) == false) goto L_0x0219;
     */
    /* JADX WARNING: Missing block: B:106:0x0214, code skipped:
            if (r6.b(r0.e) != 65535) goto L_0x0219;
     */
    /* JADX WARNING: Missing block: B:107:0x0217, code skipped:
            r0.H = 8;
     */
    /* JADX WARNING: Missing block: B:109:0x021e, code skipped:
            if (((long) r1.c) == r12) goto L_0x022c;
     */
    /* JADX WARNING: Missing block: B:110:0x0220, code skipped:
            r1.a(r12);
     */
    private final void b(defpackage.ayo r25, int r26) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r3 = r0.J;
        r4 = r1.c;
        r4 = java.lang.Integer.valueOf(r4);
        r3.add(r4);
        r3 = r1.c;
        r3 = r3 + 2;
        r4 = r1.b;
        if (r3 > r4) goto L_0x0276;
    L_0x0019:
        r3 = r25.readShort();
        r4 = r1.c;
        r5 = r3 * 12;
        r4 = r4 + r5;
        r5 = r1.b;
        if (r4 > r5) goto L_0x0276;
    L_0x0026:
        if (r3 <= 0) goto L_0x0276;
    L_0x0028:
        r5 = 0;
    L_0x0029:
        r8 = 4;
        if (r5 >= r3) goto L_0x0233;
    L_0x002c:
        r9 = r25.readUnsignedShort();
        r10 = r25.readUnsignedShort();
        r11 = r25.readInt();
        r12 = r1.c;
        r12 = (long) r12;
        r14 = 4;
        r12 = r12 + r14;
        r16 = z;
        r4 = r16[r2];
        r9 = java.lang.Integer.valueOf(r9);
        r4 = r4.get(r9);
        r4 = (defpackage.ayq) r4;
        r14 = 9;
        r6 = 3;
        r7 = 7;
        if (r4 != 0) goto L_0x0056;
    L_0x0052:
        r6 = 0;
    L_0x0054:
        r14 = 0;
        goto L_0x00a1;
    L_0x0056:
        if (r10 <= 0) goto L_0x0052;
    L_0x0058:
        r15 = b;
        r15 = r15.length;
        if (r10 < r15) goto L_0x005e;
    L_0x005d:
        goto L_0x0052;
    L_0x005e:
        r15 = r4.c;
        if (r15 == r7) goto L_0x0088;
    L_0x0062:
        if (r10 == r7) goto L_0x0088;
    L_0x0064:
        if (r15 == r10) goto L_0x0088;
    L_0x0066:
        r7 = r4.d;
        if (r7 == r10) goto L_0x0087;
    L_0x006a:
        if (r15 == r8) goto L_0x006f;
    L_0x006c:
        if (r7 == r8) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        if (r10 == r6) goto L_0x0087;
    L_0x0071:
        if (r15 == r14) goto L_0x0075;
    L_0x0073:
        if (r7 != r14) goto L_0x007a;
    L_0x0075:
        r14 = 8;
        if (r10 != r14) goto L_0x007a;
    L_0x0079:
        goto L_0x0087;
    L_0x007a:
        r14 = 12;
        if (r15 != r14) goto L_0x007f;
    L_0x007e:
        goto L_0x0082;
    L_0x007f:
        if (r7 == r14) goto L_0x0082;
    L_0x0081:
        goto L_0x0052;
    L_0x0082:
        r7 = 11;
        if (r10 == r7) goto L_0x0087;
    L_0x0086:
        goto L_0x0052;
    L_0x0087:
        r7 = 7;
    L_0x0088:
        if (r10 != r7) goto L_0x008b;
    L_0x008a:
        r10 = r15;
    L_0x008b:
        r14 = (long) r11;
        r7 = b;
        r7 = r7[r10];
        r6 = (long) r7;
        r6 = r6 * r14;
        r14 = 0;
        r20 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r20 < 0) goto L_0x0054;
    L_0x0099:
        r14 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r20 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r20 > 0) goto L_0x0054;
    L_0x00a0:
        r14 = 1;
    L_0x00a1:
        if (r14 == 0) goto L_0x0224;
    L_0x00a3:
        r14 = "Compression";
        r17 = 4;
        r15 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1));
        if (r15 <= 0) goto L_0x014b;
    L_0x00ab:
        r15 = r25.readInt();
        r8 = r0.H;
        r18 = r3;
        r3 = 7;
        if (r8 != r3) goto L_0x011f;
    L_0x00b6:
        r3 = r4.b;
        r8 = "MakerNote";
        r3 = r8.equals(r3);
        if (r3 != 0) goto L_0x0115;
    L_0x00c0:
        r3 = 6;
        if (r2 == r3) goto L_0x00cc;
    L_0x00c3:
        r19 = r5;
        r21 = r10;
        r20 = r11;
        r11 = r9;
        goto L_0x0136;
    L_0x00cc:
        r8 = r4.b;
        r3 = "ThumbnailImage";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x00c3;
    L_0x00d6:
        r0.M = r15;
        r0.N = r11;
        r3 = r0.e;
        r8 = 6;
        r3 = defpackage.ayn.a(r8, r3);
        r8 = r0.M;
        r19 = r5;
        r5 = r0.e;
        r21 = r10;
        r20 = r11;
        r10 = (long) r8;
        r5 = defpackage.ayn.a(r10, r5);
        r8 = r0.N;
        r10 = r0.e;
        r11 = r9;
        r8 = (long) r8;
        r8 = defpackage.ayn.a(r8, r10);
        r9 = r0.I;
        r10 = 4;
        r9 = r9[r10];
        r9.put(r14, r3);
        r3 = r0.I;
        r3 = r3[r10];
        r9 = "JPEGInterchangeFormat";
        r3.put(r9, r5);
        r3 = r0.I;
        r3 = r3[r10];
        r5 = "JPEGInterchangeFormatLength";
        r3.put(r5, r8);
        goto L_0x0136;
    L_0x0115:
        r19 = r5;
        r21 = r10;
        r20 = r11;
        r11 = r9;
        r0.L = r15;
        goto L_0x0136;
    L_0x011f:
        r19 = r5;
        r21 = r10;
        r20 = r11;
        r11 = r9;
        r3 = 10;
        if (r8 != r3) goto L_0x0136;
    L_0x012a:
        r3 = r4.b;
        r5 = "JpgFromRaw";
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x0136;
    L_0x0134:
        r0.O = r15;
    L_0x0136:
        r8 = (long) r15;
        r22 = r8 + r6;
        r3 = r1.b;
        r5 = r14;
        r14 = (long) r3;
        r3 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1));
        if (r3 > 0) goto L_0x0145;
    L_0x0141:
        r1.a(r8);
        goto L_0x0155;
    L_0x0145:
        r1.a(r12);
    L_0x0148:
        r8 = 0;
        goto L_0x022c;
    L_0x014b:
        r18 = r3;
        r19 = r5;
        r21 = r10;
        r20 = r11;
        r5 = r14;
        r11 = r9;
    L_0x0155:
        r3 = C;
        r3 = r3.get(r11);
        r3 = (java.lang.Integer) r3;
        if (r3 == 0) goto L_0x01b4;
    L_0x015f:
        r10 = r21;
        r4 = 3;
        if (r10 == r4) goto L_0x0187;
    L_0x0164:
        r4 = 4;
        if (r10 == r4) goto L_0x0182;
    L_0x0167:
        r4 = 8;
        if (r10 == r4) goto L_0x017d;
    L_0x016b:
        r4 = 9;
        if (r10 == r4) goto L_0x0178;
    L_0x016f:
        r4 = 13;
        if (r10 == r4) goto L_0x0178;
    L_0x0173:
        r4 = -1;
    L_0x0175:
        r6 = 0;
        goto L_0x018d;
    L_0x0178:
        r4 = r25.readInt();
        goto L_0x018b;
    L_0x017d:
        r4 = r25.readShort();
        goto L_0x018b;
    L_0x0182:
        r4 = r25.a();
        goto L_0x0175;
    L_0x0187:
        r4 = r25.readUnsignedShort();
    L_0x018b:
        r4 = (long) r4;
        goto L_0x0175;
    L_0x018d:
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 > 0) goto L_0x0192;
    L_0x0191:
        goto L_0x01b0;
    L_0x0192:
        r6 = r1.b;
        r6 = (long) r6;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x01b0;
    L_0x0199:
        r6 = r0.J;
        r7 = (int) r4;
        r7 = java.lang.Integer.valueOf(r7);
        r6 = r6.contains(r7);
        if (r6 != 0) goto L_0x01b0;
    L_0x01a6:
        r1.a(r4);
        r3 = r3.intValue();
        r0.b(r1, r3);
    L_0x01b0:
        r1.a(r12);
        goto L_0x0148;
    L_0x01b4:
        r10 = r21;
        r3 = r1.c;
        r3 = (int) r6;
        r3 = new byte[r3];
        r1.readFully(r3);
        r6 = new ayn;
        r7 = r20;
        r8 = 0;
        r6.<init>(r10, r7, r3, r8);
        r3 = r0.I;
        r3 = r3[r2];
        r7 = r4.b;
        r3.put(r7, r6);
        r3 = r4.b;
        r7 = "DNGVersion";
        r3 = r7.equals(r3);
        if (r3 == 0) goto L_0x01dc;
    L_0x01d9:
        r3 = 3;
        r0.H = r3;
    L_0x01dc:
        r3 = r4.b;
        r7 = "Make";
        r3 = r7.equals(r3);
        if (r3 == 0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x01f1;
    L_0x01e7:
        r3 = r4.b;
        r7 = "Model";
        r3 = r7.equals(r3);
        if (r3 == 0) goto L_0x0203;
    L_0x01f1:
        r3 = r0.e;
        r3 = r6.c(r3);
        r7 = "PENTAX";
        r3 = r3.contains(r7);
        if (r3 != 0) goto L_0x0200;
    L_0x01ff:
        goto L_0x0203;
    L_0x0200:
        r3 = 8;
        goto L_0x0217;
    L_0x0203:
        r3 = r4.b;
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x0219;
    L_0x020b:
        r3 = r0.e;
        r3 = r6.b(r3);
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r3 != r4) goto L_0x0219;
    L_0x0216:
        goto L_0x0200;
    L_0x0217:
        r0.H = r3;
    L_0x0219:
        r3 = r1.c;
        r3 = (long) r3;
        r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x022c;
    L_0x0220:
        r1.a(r12);
        goto L_0x022c;
    L_0x0224:
        r18 = r3;
        r19 = r5;
        r8 = 0;
        r1.a(r12);
    L_0x022c:
        r5 = r19 + 1;
        r5 = (short) r5;
        r3 = r18;
        goto L_0x0029;
    L_0x0233:
        r2 = r1.c;
        r3 = 4;
        r2 = r2 + r3;
        r3 = r1.b;
        if (r2 > r3) goto L_0x0276;
    L_0x023b:
        r2 = r25.readInt();
        r3 = (long) r2;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0276;
    L_0x0246:
        r5 = r1.b;
        if (r2 >= r5) goto L_0x0276;
    L_0x024a:
        r5 = r0.J;
        r2 = java.lang.Integer.valueOf(r2);
        r2 = r5.contains(r2);
        if (r2 != 0) goto L_0x0276;
    L_0x0256:
        r1.a(r3);
        r2 = r0.I;
        r3 = 4;
        r2 = r2[r3];
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0268;
    L_0x0264:
        r0.b(r1, r3);
        goto L_0x0276;
    L_0x0268:
        r2 = r0.I;
        r3 = 5;
        r2 = r2[r3];
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0276;
    L_0x0273:
        r0.b(r1, r3);
    L_0x0276:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.b(ayo, int):void");
    }

    private final void a(ayo ayo, HashMap hashMap) {
        ayn ayn = (ayn) hashMap.get("JPEGInterchangeFormat");
        ayn ayn2 = (ayn) hashMap.get("JPEGInterchangeFormatLength");
        if (ayn != null && ayn2 != null) {
            int b = ayn.b(this.e);
            int min = Math.min(ayn2.b(this.e), ayo.b - b);
            int i = this.H;
            if (i == 4 || i == 9 || i == 10) {
                i = this.K;
            } else {
                if (i == 7) {
                    i = this.L;
                }
                if (b > 0 && min > 0 && this.G == null && this.F == null) {
                    byte[] bArr = new byte[min];
                    ayo.a((long) b);
                    ayo.readFully(bArr);
                    return;
                }
                return;
            }
            b += i;
            if (b > 0) {
            }
        }
    }

    private final boolean a(HashMap hashMap) {
        ayn ayn = (ayn) hashMap.get("ImageLength");
        ayn ayn2 = (ayn) hashMap.get("ImageWidth");
        if (!(ayn == null || ayn2 == null)) {
            int b = ayn.b(this.e);
            int b2 = ayn2.b(this.e);
            if (b <= 512 && b2 <= 512) {
                return true;
            }
        }
        return false;
    }

    private final void c(ayo ayo, int i) {
        ayn ayn = (ayn) this.I[i].get("DefaultCropSize");
        ayn ayn2 = (ayn) this.I[i].get("SensorTopBorder");
        ayn ayn3 = (ayn) this.I[i].get("SensorLeftBorder");
        ayn ayn4 = (ayn) this.I[i].get("SensorBottomBorder");
        ayn ayn5 = (ayn) this.I[i].get("SensorRightBorder");
        String str = "ImageWidth";
        String str2 = "ImageLength";
        if (ayn != null) {
            Object a;
            Object a2;
            String str3 = "ExifInterface";
            String str4 = "Invalid crop size values. cropSize=";
            StringBuilder stringBuilder;
            if (ayn.a == 5) {
                ayp[] aypArr = (ayp[]) ayn.a(this.e);
                if (aypArr == null || aypArr.length != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str4);
                    stringBuilder.append(Arrays.toString(aypArr));
                    Log.w(str3, stringBuilder.toString());
                    return;
                }
                a = ayn.a(aypArr[0], this.e);
                a2 = ayn.a(aypArr[1], this.e);
            } else {
                int[] iArr = (int[]) ayn.a(this.e);
                if (iArr == null || iArr.length != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str4);
                    stringBuilder.append(Arrays.toString(iArr));
                    Log.w(str3, stringBuilder.toString());
                    return;
                }
                a = ayn.a(iArr[0], this.e);
                a2 = ayn.a(iArr[1], this.e);
            }
            this.I[i].put(str, a);
            this.I[i].put(str2, a2);
        } else if (ayn2 == null || ayn3 == null || ayn4 == null || ayn5 == null) {
            ayn2 = (ayn) this.I[i].get(str);
            if (((ayn) this.I[i].get(str2)) == null || ayn2 == null) {
                ayn = (ayn) this.I[i].get("JPEGInterchangeFormat");
                if (ayn != null) {
                    a(ayo, ayn.b(this.e), i);
                }
            }
        } else {
            int b = ayn2.b(this.e);
            int b2 = ayn4.b(this.e);
            int b3 = ayn5.b(this.e);
            int b4 = ayn3.b(this.e);
            if (b2 > b && b3 > b4) {
                ayn a3 = ayn.a(b2 - b, this.e);
                ayn = ayn.a(b3 - b4, this.e);
                this.I[i].put(str2, a3);
                this.I[i].put(str, ayn);
            }
        }
    }

    private final void a(int i, int i2) {
        if (!this.I[i].isEmpty() && !this.I[i2].isEmpty()) {
            String str = "ImageLength";
            ayn ayn = (ayn) this.I[i].get(str);
            String str2 = "ImageWidth";
            ayn ayn2 = (ayn) this.I[i].get(str2);
            ayn ayn3 = (ayn) this.I[i2].get(str);
            ayn ayn4 = (ayn) this.I[i2].get(str2);
            if (ayn != null && ayn2 != null && ayn3 != null && ayn4 != null) {
                int b = ayn.b(this.e);
                int b2 = ayn2.b(this.e);
                int b3 = ayn3.b(this.e);
                int b4 = ayn4.b(this.e);
                if (b < b3 && b2 < b4) {
                    HashMap[] hashMapArr = this.I;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static {
        Integer[] numArr = new Integer[4];
        Integer valueOf = Integer.valueOf(1);
        numArr[0] = valueOf;
        numArr[1] = Integer.valueOf(6);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        numArr[2] = valueOf2;
        Integer valueOf4 = Integer.valueOf(8);
        numArr[3] = valueOf4;
        Arrays.asList(numArr);
        numArr = new Integer[4];
        Integer valueOf5 = Integer.valueOf(7);
        numArr[1] = valueOf5;
        numArr[2] = Integer.valueOf(4);
        Integer valueOf6 = Integer.valueOf(5);
        numArr[3] = valueOf6;
        Arrays.asList(numArr);
        r0 = new ayq[10][];
        ayq[] ayqArr = n;
        r0[0] = ayqArr;
        r0[1] = o;
        r0[2] = p;
        r0[3] = q;
        r0[4] = r;
        r0[5] = ayqArr;
        r0[6] = t;
        r0[7] = u;
        r0[8] = v;
        r0[9] = w;
        x = r0;
        ayq ayq = new ayq("JPEGInterchangeFormat", 513, 4);
        ayq = new ayq("JPEGInterchangeFormatLength", 514, 4);
        r0 = x;
        z = new HashMap[r0.length];
        A = new HashMap[r0.length];
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < x.length; i++) {
            z[i] = new HashMap();
            A[i] = new HashMap();
            for (ayq ayq2 : x[i]) {
                z[i].put(Integer.valueOf(ayq2.a), ayq2);
                A[i].put(ayq2.b, ayq2);
            }
        }
        C.put(Integer.valueOf(y[0].a), valueOf6);
        C.put(Integer.valueOf(y[1].a), valueOf);
        C.put(Integer.valueOf(y[2].a), valueOf3);
        C.put(Integer.valueOf(y[3].a), valueOf2);
        C.put(Integer.valueOf(y[4].a), valueOf5);
        C.put(Integer.valueOf(y[5].a), valueOf4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }
}
