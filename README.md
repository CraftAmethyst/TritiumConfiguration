# Tritium Configuration

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.21-green.svg)](https://www.minecraft.net/)
[![Documentation](https://img.shields.io/badge/docs-online-blue.svg)](http://caorg.abreeze.icu/)

A powerful and flexible configuration API for Minecraft mods, supporting both **Fabric**/**Forge** and **NeoForge** platforms with automatic UI generation and internationalization (i18n) support.

## Features

- **Multi-Platform Support**: Works seamlessly on both Fabric and NeoForge
- **Automatic UI Generation**: Integrates with Cloth Config for automatic configuration screen generation
- **Internationalization (i18n)**: Built-in support for multiple languages
- **Hot Reload**: Automatic configuration file watching and reloading
- **Validation**: Comprehensive configuration validation with annotations
- **Type-Safe**: Strongly typed configuration with compile-time safety
- **Easy Integration**: Simple API for mod developers
- **Client/Server Separation**: Support for client-only and server-only configurations
- **Migration Support**: Built-in configuration migration and versioning
- **Rich Annotations**: Extensive annotation system for fine-grained control

## Documentation

For comprehensive documentation, please visit our [documentation site](http://caorg.abreeze.icu/):

- [English Documentation](http://caorg.abreeze.icu/en_us/tritium-config-api/)
- [中文文档](http://caorg.abreeze.icu/zh_cn/tritium-config-api/)

### Quick Links

- [Getting Started](http://caorg.abreeze.icu/en_us/tritium-config-api/getting-started)
- [Annotation Reference](http://caorg.abreeze.icu/en_us/tritium-config-api/annotations)
- [Internationalization Guide](http://caorg.abreeze.icu/en_us/tritium-config-api/i18n)
- [Auto UI Generation](http://caorg.abreeze.icu/en_us/tritium-config-api/ui-autoconfig)
- [FAQ](http://caorg.abreeze.icu/en_us/tritium-config-api/faq)

## Quick Start

To get started with Tritium Configuration, please visit our comprehensive [Getting Started Guide](http://caorg.abreeze.icu/en_us/tritium-config-api/getting-started).

The documentation covers:
- Adding Tritium Configuration as a dependency
- Creating your first configuration class
- Registering configurations for Fabric and NeoForge
- Using annotations for validation and organization
- Generating automatic UI screens
- Setting up internationalization

For detailed API usage and examples, please refer to the [documentation site](http://caorg.abreeze.icu/).

## Building from Source

### Prerequisites

- Java 21 or higher
- Gradle (included via wrapper)

### Build Commands

```bash
# Build all platforms
./gradlew build

# Build Fabric only
./gradlew :fabric:build

# Build NeoForge only
./gradlew :neoforge:build
```

## Requirements

- **Minecraft**: 1.21+
- **Java**: 21+
- **Fabric Loader**: 0.15.11+ (for Fabric)
- **NeoForge**: 21.0.110-beta+ (for NeoForge)
- **Cloth Config**: 15.0.140+ (automatically included)

## License

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details.

## Authors

- **ZCRAFT** - *Initial work and maintenance*
- **QianMo0721** - *Maintainer, responsible for fixing bugs and optimizing code*

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Links

- [Documentation](http://caorg.abreeze.icu/)
- [GitHub Repository](https://github.com/craftamethyst/TritiumConfiguration)
- [CraftAmethyst Organization](https://github.com/craftamethyst)

## Support

For questions, issues, or feature requests, please visit our [GitHub Issues](https://github.com/craftamethyst/TritiumConfiguration/issues) page.

---

Made with ❤️ by the CraftAmethyst Organization.   

