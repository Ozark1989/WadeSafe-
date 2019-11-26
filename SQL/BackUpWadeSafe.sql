USE [wadeSafe]
GO

/****** Object:  Table [dbo].[accessPTB]    Script Date: 10/21/2019 9:45:19 AM ******/
DROP TABLE [dbo].[accessPTB]
GO

/****** Object:  Table [dbo].[accessPTB]    Script Date: 10/21/2019 9:45:19 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[accessPTB](
	[id] [int] NOT NULL,
	[name] [varchar](50) NULL,
	[descript] [varchar](max) NULL,
	[photos] [varchar](100) NULL,
	[riverMiles] [int] NULL,
	[boatRamp] [bit] NULL,
	[regs] [bit] NULL,
	[regDescript] [varchar](max) NULL,
	[algoID] [int] NULL,
	[damID] [int] NULL,
 CONSTRAINT [PK_accessPTB] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



USE [wadeSafe]
GO

/****** Object:  Table [dbo].[algoTB]    Script Date: 10/21/2019 9:45:39 AM ******/
DROP TABLE [dbo].[algoTB]
GO

/****** Object:  Table [dbo].[algoTB]    Script Date: 10/21/2019 9:45:39 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[algoTB](
	[id] [int] NOT NULL,
	[rise] [int] NULL,
	[fall] [int] NULL,
	[repID] [int] NULL,
 CONSTRAINT [PK_algoTB] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO



USE [wadeSafe]
GO

/****** Object:  Table [dbo].[reportTB]    Script Date: 10/21/2019 9:44:35 AM ******/
DROP TABLE [dbo].[reportTB]
GO

/****** Object:  Table [dbo].[reportTB]    Script Date: 10/21/2019 9:44:35 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[reportTB](
	[id] [int] NOT NULL IDENTITY (1, 1),
	[hour] [int] NULL,
	[units] [int] NULL,
	[date] [int] NULL,
	[damID] [int] NULL,
 CONSTRAINT [PK_reportTB] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO