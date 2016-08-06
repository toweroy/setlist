package org.toweroy.setlist.setlistfm;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Attended;

import static org.junit.Assert.assertEquals;

/**
 * Created by richardtolman on 06/08/16.
 */
public class AttendedTest {
    private static final String ATTENDED_JSON = "{\n" +
            "  \"setlists\": {\n" +
            "    \"@itemsPerPage\": \"20\",\n" +
            "    \"@page\": \"1\",\n" +
            "    \"@total\": \"62\",\n" +
            "    \"setlist\": [\n" +
            "      {\n" +
            "        \"@eventDate\": \"17-07-2016\",\n" +
            "        \"@id\": \"53ff2bcd\",\n" +
            "        \"@lastUpdated\": \"2016-07-22T13:08:27.000+0000\",\n" +
            "        \"@versionId\": \"53ac23e9\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"US death metal band\",\n" +
            "          \"@mbid\": \"2e8ac3ed-2a89-4377-ba80-790106aba554\",\n" +
            "          \"@name\": \"Obituary\",\n" +
            "          \"@sortName\": \"Obituary\",\n" +
            "          \"@tmid\": \"741644\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/obituary-bd6fd46.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Redneck Stomp\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Centuries of Lies\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Visions in My Head\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Intoxicated\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Bloodsoaked\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Dying\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Find the Arise\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"'Til Death\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Don't Care\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Chopped in Half\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Turned Inside Out\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Slowly We Rot\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/obituary\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-53ff2bcd.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"17-07-2016\",\n" +
            "        \"@id\": \"63ff2ecb\",\n" +
            "        \"@lastUpdated\": \"2016-07-17T22:33:27.000+0000\",\n" +
            "        \"@tour\": \"2016\\/2017 Anniversary Shows\",\n" +
            "        \"@versionId\": \"23acec5f\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"6a726ac6-019e-455c-8bbb-571a77bed52e\",\n" +
            "          \"@name\": \"Thin Lizzy\",\n" +
            "          \"@sortName\": \"Thin Lizzy\",\n" +
            "          \"@tmid\": \"840376\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/thin-lizzy-33d6802d.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Jailbreak\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Are You Ready\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Killer on the Loose\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Dancing in the Moonlight (It's Caught Me in Its Spotlight)\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Massacre\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Emerald\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Rosalie\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"4382b934-64c3-47ac-98db-65f26d845c48\",\n" +
            "                  \"@name\": \"Bob Seger\",\n" +
            "                  \"@sortName\": \"Seger, Bob\",\n" +
            "                  \"@tmid\": \"771811\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/bob-seger-7bd6be3c.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Don't Believe a Word\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Cowboy Song\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Boys Are Back in Town\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Róisín Dubh (Black Rose): A Rock Legend\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Whiskey in the Jar\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"Special Purpose Artist\",\n" +
            "                  \"@mbid\": \"9be7f096-97ec-4615-8957-8d40b5dcbc41\",\n" +
            "                  \"@name\": \"[traditional]\",\n" +
            "                  \"@sortName\": \"[traditional]\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/traditional-5bd2f7e4.html\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/thin-lizzy\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-63ff2ecb.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"17-07-2016\",\n" +
            "        \"@id\": \"7bff2e80\",\n" +
            "        \"@lastUpdated\": \"2016-07-17T19:10:37.000+0000\",\n" +
            "        \"@versionId\": \"6bacf236\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"5b687684-ad34-4a9f-b425-0e7aa81fbd38\",\n" +
            "          \"@name\": \"Amon Amarth\",\n" +
            "          \"@sortName\": \"Amon Amarth\",\n" +
            "          \"@tmid\": \"1151850\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/amon-amarth-4bd68312.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"The Pursuit of Vikings\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"As Loke Falls\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"First Kill\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Cry of the Black Birds\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Death in Fire\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Deceiver of the Gods\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Runes to My Memory\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"War of the Gods\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Raise Your Horns\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Guardians of Asgaard\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Twilight of the Thunder God\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/amon-amarth\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-7bff2e80.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"17-07-2016\",\n" +
            "        \"@id\": \"63ff2e87\",\n" +
            "        \"@lastUpdated\": \"2016-07-17T18:09:46.000+0000\",\n" +
            "        \"@tour\": \"For All Kings\",\n" +
            "        \"@versionId\": \"5bacf3f8\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"US thrash metal band\",\n" +
            "          \"@mbid\": \"b616d6f0-ec1f-4c69-8a79-12a97ece7372\",\n" +
            "          \"@name\": \"Anthrax\",\n" +
            "          \"@sortName\": \"Anthrax\",\n" +
            "          \"@tmid\": \"734447\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/anthrax-7bd68e98.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": [\n" +
            "            {\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"Impaled\",\n" +
            "                  \"@tape\": \"true\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"You Gotta Believe\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Caught in a Mosh\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Got the Time\",\n" +
            "                  \"cover\": {\n" +
            "                    \"@disambiguation\": \"English musician\",\n" +
            "                    \"@mbid\": \"07f6d469-38f3-46da-9cfa-2f532422b84e\",\n" +
            "                    \"@name\": \"Joe Jackson\",\n" +
            "                    \"@sortName\": \"Jackson, Joe\",\n" +
            "                    \"@tmid\": \"852419\",\n" +
            "                    \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/joe-jackson-4bd6b78a.html\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Madhouse\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Fight 'Em 'Til You Can't\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Evil Twin\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Antisocial\",\n" +
            "                  \"cover\": {\n" +
            "                    \"@disambiguation\": \"70s\\/80s French hard rock band\",\n" +
            "                    \"@mbid\": \"33d281da-d36f-4d22-9c4f-fa39f9718302\",\n" +
            "                    \"@name\": \"Trust\",\n" +
            "                    \"@sortName\": \"Trust\",\n" +
            "                    \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/trust-3d7b14b.html\"\n" +
            "                  }\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"@encore\": \"1\",\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"Breathing Lightning\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Indians\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/anthrax\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-63ff2e87.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"17-07-2016\",\n" +
            "        \"@id\": \"7bff2e84\",\n" +
            "        \"@lastUpdated\": \"2016-07-19T21:44:00.000+0000\",\n" +
            "        \"@versionId\": \"2bacc412\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"c87ddc3a-a8f4-4764-9c07-978fb5c8bf33\",\n" +
            "          \"@name\": \"Impellitteri\",\n" +
            "          \"@sortName\": \"Impellitteri\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/impellitteri-73d6aafd.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"O Fortuna\",\n" +
            "                \"@tape\": \"true\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"0b3ee6cd-a2df-4144-adf9-7807ee7ecc4f\",\n" +
            "                  \"@name\": \"Carl Orff\",\n" +
            "                  \"@sortName\": \"Orff, Carl\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/carl-orff-7bd4ce90.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The King Is Rising\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Speed Demon\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Warrior\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Future Is Black\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"We Own the Night\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Stand in Line\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Wicked Maiden\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Lost in the Rain\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Time Machine\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Answer to the Master\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/impellitteri\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-7bff2e84.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"16-07-2016\",\n" +
            "        \"@id\": \"1bff31a0\",\n" +
            "        \"@lastUpdated\": \"2016-07-16T18:17:32.000+0000\",\n" +
            "        \"@versionId\": \"53ac83f5\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"6f76ed1a-1026-4fa8-a472-43fe0b8a3c8f\",\n" +
            "          \"@name\": \"Unisonic\",\n" +
            "          \"@sortName\": \"Unisonic\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/unisonic-63d522c3.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Venite 2.0\",\n" +
            "                \"@tape\": \"true\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"For the Kingdom\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Exceptional\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"King for a Day\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Your Time Has Come\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"When the Deed Is Done\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Star Rider\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Throne of the Dawn\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"March of Time\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"German power metal band\",\n" +
            "                  \"@mbid\": \"765774a0-2060-469b-8b7d-612eea48579b\",\n" +
            "                  \"@name\": \"Helloween\",\n" +
            "                  \"@sortName\": \"Helloween\",\n" +
            "                  \"@tmid\": \"735265\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/helloween-5bd683a8.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"I Want Out\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"German power metal band\",\n" +
            "                  \"@mbid\": \"765774a0-2060-469b-8b7d-612eea48579b\",\n" +
            "                  \"@name\": \"Helloween\",\n" +
            "                  \"@sortName\": \"Helloween\",\n" +
            "                  \"@tmid\": \"735265\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/helloween-5bd683a8.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Unisonic\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/unisonic\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-1bff31a0.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"16-07-2016\",\n" +
            "        \"@id\": \"13ff31a1\",\n" +
            "        \"@lastUpdated\": \"2016-07-17T01:01:39.000+0000\",\n" +
            "        \"@versionId\": \"63acfef3\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"c7e3d0fe-a1e7-490f-8d8d-7580e67e6d52\",\n" +
            "          \"@name\": \"Rata Blanca\",\n" +
            "          \"@sortName\": \"Rata Blanca\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/rata-blanca-bd61166.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Tormenta eléctrica\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Los chicos quieren rock\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Sólo para amarte\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"El círculo de fuego\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Volviendo a casa\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"El beso de la bruja\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Rock and Roll Hotel\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Aún estás en mis sueños\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Guerrero del arco iris\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Mujer amante\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"La leyenda del hada y el mago\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/rata-blanca\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-13ff31a1.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"16-07-2016\",\n" +
            "        \"@id\": \"3bff3480\",\n" +
            "        \"@lastUpdated\": \"2016-07-16T21:20:18.000+0000\",\n" +
            "        \"@tour\": \"The Book of Souls World Tour\",\n" +
            "        \"@versionId\": \"bacfd1e\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"English heavy metal band\",\n" +
            "          \"@mbid\": \"ca891d65-d9b0-4258-89f7-e6ba29d83767\",\n" +
            "          \"@name\": \"Iron Maiden\",\n" +
            "          \"@sortName\": \"Iron Maiden\",\n" +
            "          \"@tmid\": \"735341\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/iron-maiden-3bd6803c.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": [\n" +
            "            {\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"Doctor Doctor\",\n" +
            "                  \"@tape\": \"true\",\n" +
            "                  \"cover\": {\n" +
            "                    \"@disambiguation\": \"Latvian DJ\",\n" +
            "                    \"@mbid\": \"f19854df-0603-4120-aeec-765b39d415b0\",\n" +
            "                    \"@name\": \"UFO\",\n" +
            "                    \"@sortName\": \"UFO\",\n" +
            "                    \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/ufo-23d6acf3.html\"\n" +
            "                  }\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"If Eternity Should Fail\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Speed of Light\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Children of the Damned\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Tears of a Clown\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"The Red and the Black\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"The Trooper\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Powerslave\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Death or Glory\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"The Book of Souls\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Hallowed Be Thy Name\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Fear of the Dark\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Iron Maiden\"\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"@encore\": \"1\",\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"The Number of the Beast\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Blood Brothers\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Wasted Years\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Always Look on the Bright Side of Life\",\n" +
            "                  \"@tape\": \"true\",\n" +
            "                  \"cover\": {\n" +
            "                    \"@disambiguation\": \"\",\n" +
            "                    \"@mbid\": \"4a5c8526-f8ec-43f1-97af-49722ad88394\",\n" +
            "                    \"@name\": \"Monty Python\",\n" +
            "                    \"@sortName\": \"Monty Python\",\n" +
            "                    \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/monty-python-13d6c1c9.html\"\n" +
            "                  }\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/iron-maiden\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bff3480.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"16-07-2016\",\n" +
            "        \"@id\": \"53ff3761\",\n" +
            "        \"@lastUpdated\": \"2016-07-31T22:47:05.000+0000\",\n" +
            "        \"@tour\": \"35th Anniversary Year \\\"SHOCKING DEVIL'S LAND\\\" Tour in Europe\",\n" +
            "        \"@versionId\": \"5bad9f3c\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"Japanese heavy metal band\",\n" +
            "          \"@mbid\": \"513b6df2-f44c-4484-b99d-97f79266cb4a\",\n" +
            "          \"@name\": \"Loudness\",\n" +
            "          \"@sortName\": \"Loudness\",\n" +
            "          \"@tmid\": \"735542\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/loudness-1bd7a598.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Crazy Nights\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Heavy Chains\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Sun Will Rise Again\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Loudness\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Let It Go\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Got to Be Strong\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Power of Truth\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Law of Devil's Land\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"In the Mirror\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Crazy Doctor\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"S.D.I.\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/loudness\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-53ff3761.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"73ff3e39\",\n" +
            "        \"@lastUpdated\": \"2016-07-15T21:56:53.000+0000\",\n" +
            "        \"@versionId\": \"7bac9238\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"2bc078c7-bf5c-4d01-b255-6588f82f2ccf\",\n" +
            "          \"@name\": \"Michael Schenker\",\n" +
            "          \"@sortName\": \"Schenker, Michael\",\n" +
            "          \"@tmid\": \"890401\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-63d6aa47.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Searching for Freedom\",\n" +
            "                \"@tape\": \"true\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Into the Arena\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Attack of the Mad Axeman\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Victim of Illusion\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Rock My Nights Away\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"On and On\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Cry for the Nations\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Let Sleeping Dogs Lie\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Armed and Ready\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"\",\n" +
            "                  \"@mbid\": \"db005731-6c46-4e7d-83e3-21f80189884a\",\n" +
            "                  \"@name\": \"Michael Schenker Group\",\n" +
            "                  \"@sortName\": \"Schenker, Michael, Group\",\n" +
            "                  \"@tmid\": \"890399\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/michael-schenker-group-7bd6aa68.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Coast to Coast\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"German rock band\",\n" +
            "                  \"@mbid\": \"c3cceeed-3332-4cf0-8c4c-bbde425147b6\",\n" +
            "                  \"@name\": \"Scorpions\",\n" +
            "                  \"@sortName\": \"Scorpions\",\n" +
            "                  \"@tmid\": \"736062\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/scorpions-3d63ddf.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Doctor Doctor\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"British Space Rock\\/Hard Rock band\",\n" +
            "                  \"@mbid\": \"c0bf9e20-2872-4897-ad1f-0882b83272a0\",\n" +
            "                  \"@name\": \"UFO\",\n" +
            "                  \"@sortName\": \"UFO\",\n" +
            "                  \"@tmid\": \"906206\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/ufo-23d6acff.html\"\n" +
            "                }\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Rock Bottom\",\n" +
            "                \"cover\": {\n" +
            "                  \"@disambiguation\": \"British Space Rock\\/Hard Rock band\",\n" +
            "                  \"@mbid\": \"c0bf9e20-2872-4897-ad1f-0882b83272a0\",\n" +
            "                  \"@name\": \"UFO\",\n" +
            "                  \"@sortName\": \"UFO\",\n" +
            "                  \"@tmid\": \"906206\",\n" +
            "                  \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/ufo-23d6acff.html\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/michael-schenker\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-73ff3e39.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"7bff3e00\",\n" +
            "        \"@lastUpdated\": \"2016-07-15T23:15:14.000+0000\",\n" +
            "        \"@versionId\": \"7bac92a4\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"7fa7fc04-1011-4876-8095-ecd232edea87\",\n" +
            "          \"@name\": \"Blind Guardian\",\n" +
            "          \"@sortName\": \"Blind Guardian\",\n" +
            "          \"@tmid\": \"843722\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/blind-guardian-5bd683c4.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"The Ninth Wave\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Script for My Requiem\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Time Stands Still (at the Iron Hill)\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Tanelorn (Into the Void)\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Last Candle\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Twilight of the Gods\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Imaginations from the Other Side\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Sacred Worlds\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Bright Eyes\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Bard's Song - In the Forest\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Valhalla\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/blind-guardian\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-7bff3e00.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"73ff3e05\",\n" +
            "        \"@lastUpdated\": \"2016-07-13T00:26:26.000+0000\",\n" +
            "        \"@versionId\": \"33acbc1d\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"d044577e-aa22-43b7-ab29-cabee5f6643c\",\n" +
            "          \"@name\": \"Heaven Shall Burn\",\n" +
            "          \"@sortName\": \"Heaven Shall Burn\",\n" +
            "          \"@tmid\": \"1190397\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/heaven-shall-burn-13d6d989.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": \"\",\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/heaven-shall-burn\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-73ff3e05.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"73ff3e01\",\n" +
            "        \"@lastUpdated\": \"2016-07-18T22:04:09.000+0000\",\n" +
            "        \"@versionId\": \"bacd5be\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"39822e8d-f24e-4f07-b51b-28b22e59fbdb\",\n" +
            "          \"@name\": \"Kreator\",\n" +
            "          \"@sortName\": \"Kreator\",\n" +
            "          \"@tmid\": \"735470\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/kreator-63d68e97.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Enemy of God\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Terrible Certainty\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Phobia\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Awakening of the Gods \\/ Endless Pain\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Warcurse\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Mars Mantra\",\n" +
            "                \"@tape\": \"true\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Phantom Antichrist\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"From Flood into Fire\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Hordes of Chaos (A Necrologue for the Elite)\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Civilization Collapse\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"The Patriarch\",\n" +
            "                \"@tape\": \"true\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Violent Revolution\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Pleasure to Kill\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/kreator\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-73ff3e01.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"6bff3e06\",\n" +
            "        \"@lastUpdated\": \"2016-07-15T19:38:41.000+0000\",\n" +
            "        \"@versionId\": \"33ac90a9\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"fa3b825f-7c85-4377-b393-d28a2016e293\",\n" +
            "          \"@name\": \"Mägo de Oz\",\n" +
            "          \"@sortName\": \"Mägo de Oz\",\n" +
            "          \"@tmid\": \"1264614\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/mago-de-oz-3d6116f.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Prólogo\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Satania\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"La cruz de Santiago\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Pensatorium\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"La danza del fuego\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Astaroth\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Molinos de viento\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Finisterra\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/mago-de-oz\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-6bff3e06.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"6bff3efa\",\n" +
            "        \"@lastUpdated\": \"2016-07-15T16:17:18.000+0000\",\n" +
            "        \"@versionId\": \"73ac96b5\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"Swiss Thrash Metal Band\",\n" +
            "          \"@mbid\": \"509dc5b1-f264-43f3-9035-473e7020e77f\",\n" +
            "          \"@name\": \"Coroner\",\n" +
            "          \"@sortName\": \"Coroner\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/coroner-63d69e93.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Masked Jackal\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Grin (Nails Hurt)\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/coroner\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-6bff3efa.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"15-07-2016\",\n" +
            "        \"@id\": \"7bff3e04\",\n" +
            "        \"@lastUpdated\": \"2016-07-15T17:22:51.000+0000\",\n" +
            "        \"@versionId\": \"13ac91c5\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"Hard rock, AOR\",\n" +
            "          \"@mbid\": \"98af45d8-fff7-48e4-afa9-48dc5fd18581\",\n" +
            "          \"@name\": \"Tyketto\",\n" +
            "          \"@sortName\": \"Tyketto\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/tyketto-33d6f08d.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"3bd4246c\",\n" +
            "          \"@name\": \"Parc de Can Zam\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"3109981\",\n" +
            "            \"@name\": \"Santa Coloma de Gramenet\",\n" +
            "            \"@state\": \"Catalonia\",\n" +
            "            \"@stateCode\": \"56\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"41.4515243040983\",\n" +
            "              \"@long\": \"2.20810174942017\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"ES\",\n" +
            "              \"@name\": \"Spain\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": {\n" +
            "            \"song\": [\n" +
            "              {\n" +
            "                \"@name\": \"Sail Away\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Strip Me Down\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Nothing But Love\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Walk on Fire\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Lay Your Body Down\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Standing Alone\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Seasons\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Burning Down Inside\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Wings\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"@name\": \"Forever Young\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/tyketto\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-7bff3e04.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"13-06-2016\",\n" +
            "        \"@id\": \"2bfe7056\",\n" +
            "        \"@lastUpdated\": \"2016-07-27T15:37:12.000+0000\",\n" +
            "        \"@tour\": \"Passion and Warfare 25th Anniversary Tour\",\n" +
            "        \"@versionId\": \"4bac5bb6\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"5e7ccd92-6277-451a-aab9-1efd587c50f3\",\n" +
            "          \"@name\": \"Steve Vai\",\n" +
            "          \"@sortName\": \"Vai, Steve\",\n" +
            "          \"@tmid\": \"736378\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/steve-vai-2bd6b0f6.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"73d64ec5\",\n" +
            "          \"@name\": \"Debaser Medis\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"2673730\",\n" +
            "            \"@name\": \"Stockholm\",\n" +
            "            \"@state\": \"Stockholm County\",\n" +
            "            \"@stateCode\": \"26\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"59.3325765361753\",\n" +
            "              \"@long\": \"18.0649030208588\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"SE\",\n" +
            "              \"@name\": \"Sweden\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/debaser-medis-stockholm-sweden-73d64ec5.html\"\n" +
            "        },\n" +
            "        \"sets\": \"\",\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/steve-vai\\/2016\\/debaser-medis-stockholm-sweden-2bfe7056.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"29-03-2016\",\n" +
            "        \"@id\": \"33f060f1\",\n" +
            "        \"@lastUpdated\": \"2016-03-29T16:27:12.000+0000\",\n" +
            "        \"@versionId\": \"43a52797\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"133d325f-7556-442b-a3cc-f0b60d00daab\",\n" +
            "          \"@name\": \"Closet Disco Queen\",\n" +
            "          \"@sortName\": \"Closet Disco Queen\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/closet-disco-queen-53c2f7f5.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"73d64ec5\",\n" +
            "          \"@name\": \"Debaser Medis\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"2673730\",\n" +
            "            \"@name\": \"Stockholm\",\n" +
            "            \"@state\": \"Stockholm County\",\n" +
            "            \"@stateCode\": \"26\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"59.3325765361753\",\n" +
            "              \"@long\": \"18.0649030208588\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"SE\",\n" +
            "              \"@name\": \"Sweden\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/debaser-medis-stockholm-sweden-73d64ec5.html\"\n" +
            "        },\n" +
            "        \"sets\": \"\",\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/closet-disco-queen\\/2016\\/debaser-medis-stockholm-sweden-33f060f1.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"29-03-2016\",\n" +
            "        \"@id\": \"4bf0777e\",\n" +
            "        \"@lastUpdated\": \"2016-03-30T07:18:42.000+0000\",\n" +
            "        \"@versionId\": \"6ba516a6\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"\",\n" +
            "          \"@mbid\": \"eeb41a1e-4326-4d04-8c47-0f564ceecd68\",\n" +
            "          \"@name\": \"Baroness\",\n" +
            "          \"@sortName\": \"Baroness\",\n" +
            "          \"@tmid\": \"1257445\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/baroness-53d63b31.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"73d64ec5\",\n" +
            "          \"@name\": \"Debaser Medis\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"2673730\",\n" +
            "            \"@name\": \"Stockholm\",\n" +
            "            \"@state\": \"Stockholm County\",\n" +
            "            \"@stateCode\": \"26\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"59.3325765361753\",\n" +
            "              \"@long\": \"18.0649030208588\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"SE\",\n" +
            "              \"@name\": \"Sweden\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/debaser-medis-stockholm-sweden-73d64ec5.html\"\n" +
            "        },\n" +
            "        \"sets\": {\n" +
            "          \"set\": [\n" +
            "            {\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"Kerosene\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"March to the Sea\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Morningstar\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Shock Me\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Board Up the House\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Green Theme\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"The Iron Bell\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Fugue\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"If I Have to Wake Up (Would You Stop the Rain?)\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Sea Lungs\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Chlorine & Wine\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"The Gnashing\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Try to Disappear\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Desperation Burns\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Eula\"\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"@encore\": \"1\",\n" +
            "              \"song\": [\n" +
            "                {\n" +
            "                  \"@name\": \"Isak\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"@name\": \"Take My Bones Away\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/baroness\\/2016\\/debaser-medis-stockholm-sweden-4bf0777e.html\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"@eventDate\": \"29-03-2016\",\n" +
            "        \"@id\": \"33f060f5\",\n" +
            "        \"@lastUpdated\": \"2016-03-29T16:30:03.000+0000\",\n" +
            "        \"@versionId\": \"43a5278b\",\n" +
            "        \"artist\": {\n" +
            "          \"@disambiguation\": \"Swedish progressive stoner\\/sludge band\",\n" +
            "          \"@mbid\": \"241ea4cc-2e78-4969-aa7f-d2b1a920d6b2\",\n" +
            "          \"@name\": \"Colossus\",\n" +
            "          \"@sortName\": \"Colossus\",\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/setlists\\/colossus-5bc683d0.html\"\n" +
            "        },\n" +
            "        \"venue\": {\n" +
            "          \"@id\": \"73d64ec5\",\n" +
            "          \"@name\": \"Debaser Medis\",\n" +
            "          \"city\": {\n" +
            "            \"@id\": \"2673730\",\n" +
            "            \"@name\": \"Stockholm\",\n" +
            "            \"@state\": \"Stockholm County\",\n" +
            "            \"@stateCode\": \"26\",\n" +
            "            \"coords\": {\n" +
            "              \"@lat\": \"59.3325765361753\",\n" +
            "              \"@long\": \"18.0649030208588\"\n" +
            "            },\n" +
            "            \"country\": {\n" +
            "              \"@code\": \"SE\",\n" +
            "              \"@name\": \"Sweden\"\n" +
            "            }\n" +
            "          },\n" +
            "          \"url\": \"http:\\/\\/www.setlist.fm\\/venue\\/debaser-medis-stockholm-sweden-73d64ec5.html\"\n" +
            "        },\n" +
            "        \"sets\": \"\",\n" +
            "        \"url\": \"http:\\/\\/www.setlist.fm\\/setlist\\/colossus\\/2016\\/debaser-medis-stockholm-sweden-33f060f5.html\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    @Test
    public void getAttendedFromJson() {
        Attended attended = Attended.toAttended(ATTENDED_JSON);
        assertEquals(1, attended.getSetlists().size());
        assertEquals(20, attended.getSetlists().get(0).getItemsPerPage());
    }
}
