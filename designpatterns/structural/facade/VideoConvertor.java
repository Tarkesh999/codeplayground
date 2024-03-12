package com.lld.designpatterns.structural.facade;

class VideoFile{ }
interface  CompressionCodec{};
class OggCompressionCodec implements  CompressionCodec{ }
class MPEG4CompressionCodec implements  CompressionCodec{ }
class CodecFactory{ }
class BitrateReader{ static Object read(String name){return null;} }
class AudioMixer{ }

public class VideoConvertor {
    void convert(String filename,String format){
        VideoFile file = new VideoFile();
        CompressionCodec destinationCodec;
        if (format == "mp4")
            destinationCodec = new MPEG4CompressionCodec();
        else
            destinationCodec = new OggCompressionCodec();
        Object buffer = BitrateReader.read(filename);
    }
}
