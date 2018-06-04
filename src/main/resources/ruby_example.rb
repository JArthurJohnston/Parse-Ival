
module ParatusSoftware

    class ParentExample
        attr_reader :thingy
    end

    class RubyExample < ParentExample

        def test_method(random_text)
            puts 'Hello world: ' + random_text
        end

    end

end


ParatusSoftware::RubyExample.new.test_method('Foo Bar')
