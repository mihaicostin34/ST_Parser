# ST_Parser
This repository is a project that turns Structured Text from the IEC 61131 Standard into Web Aseembly.
The imported functions getpin and setpin are meant to add I/O features when uploading the code to a microcontroller.
As a way to interact with the input and output ports, I am using the keywords INPUT_PIN_n and OUTPUT_PIN_n, where n is the number of the desired pin

## Project purpose
This is part of a bigger project which aims to turn a microprocessor into a PLC. In order to make the microcontroller understand the Structured Text format, I wrote a parser that turns it into Web Aseembly that can easily be compiled and uploaded onto any board which can interpret it. 